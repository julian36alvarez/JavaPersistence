import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_MYSQLSQLConction() {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mensajes_app", "root", "");
            if (conection != null) {
                System.out.println("Conexion Exitosa MYSQL");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conection;
    }

    public Connection get_postgreSQLConection() {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/mensajeria_db", "postgres", "w");
            System.out.println("Conexion Exitosa POSTGRESQL");
            System.out.println("conection = " + conection);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
}
