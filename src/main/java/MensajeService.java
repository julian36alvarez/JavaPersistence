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

    }

    public static void borrarMensajes() {

    }

    public static void editarMensaje() {

    }

}
