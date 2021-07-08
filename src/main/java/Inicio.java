import java.sql.Connection;

public class Inicio {
    public static void main(String[] args) {

        Conexion connection = new Conexion();

        try(Connection cnMysql= connection.get_MYSQLSQLConction()) {

        }catch (Exception e){
            System.out.println(e);
        }

        try(Connection cnMysql= connection.get_postgreSQLConection()) {

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
