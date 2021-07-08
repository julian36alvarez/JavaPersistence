import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("----------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear Mensajes:");
            System.out.println("2. Listar Mensajes:");
            System.out.println("3. Editar Mensajes:");
            System.out.println("4. Eliminar Mensajes:");
            System.out.println("5. Salir:");
            option = sr.nextInt();

            switch (option){
                case 1:
                    MensajeService.crearMensaje();
                    break;
                case 2:
                    MensajeService.listarMensajes();
                    break;
                case 3:
                    MensajeService.editarMensaje();
                    break;
                case 4:
                    MensajeService.borrarMensajes();
                    break;

                default:
                    break;
            }
        }while (option!=5);



    }
}
