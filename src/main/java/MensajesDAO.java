import java.sql.*;
import java.time.Instant;

public class MensajesDAO {
    public static void CrearMensajeDB(MensajesModel mensaje) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_postgreSQLConection()) {
            PreparedStatement ps = null;
            try {
                String consulta = "INSERT INTO public.mensajes(autor, fecha, mensaje) VALUES ( ?, ?, ?);";
                ps = conexion.prepareStatement(consulta);
                ps.setString(1, mensaje.getAutor());
                ps.setTimestamp(2, Timestamp.from(Instant.now()));
                ps.setString(3, mensaje.getMensaje());
                ps.executeUpdate();
                System.out.println("Result: = Creation Successful ");
            } catch (SQLException ex) {
                System.out.println("ex = " + ex);
            }
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
    }

    public static void leerMensajeDB() {
        Conexion db_connect = new Conexion();
        PreparedStatement ps=null;
        ResultSet rs = null;
        try (Connection conexion = db_connect.get_postgreSQLConection()) {
            String query = "select * from mensajes";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("ID = " + rs.getInt("id_mensaje"));
                System.out.println("Autor = " + rs.getString("autor"));
                System.out.println("Mensaje = " + rs.getString("mensaje"));
                System.out.println("Fecha = " + rs.getTimestamp("fecha"));
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
    }

    public static void borrarMensajeDB(int id_mensaje) {

    }

    public static void actualizaMensajeDB(MensajesModel mensaje) {

    }

}
