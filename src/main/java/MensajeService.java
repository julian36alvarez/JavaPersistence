import java.util.Scanner;

public class MensajeService {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escibe tu mensaje:");
        String mensaje = sc.nextLine();
        System.out.println("El Autor es:");
        String nombre = sc.nextLine();

        MensajesModel tupla = new MensajesModel();
        tupla.setAutor(nombre);
        tupla.setMensaje(mensaje);
        MensajesDAO.CrearMensajeDB(tupla);
    }

    public static void listarMensajes() {
        MensajesDAO.leerMensajeDB();
    }

    public static void borrarMensajes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escibe el mensaje a Eliminar:");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }

    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();

        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje= sc.nextInt();
        MensajesModel actualizacion = new MensajesModel();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizaMensajeDB(actualizacion);
    }

}
