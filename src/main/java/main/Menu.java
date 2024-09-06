package main;

import java.util.Scanner;
import persistencia.agendaContactos;

/**
 *
 * @author tacot
 */
public class Menu {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        agendaContactos ag = new agendaContactos();
        
        int opcion;

        do {
            System.out.println("--- Bienvenido a tu agenda de contactos ---");
            System.out.println("--- Elige una de las siguientes opciones ---");
            System.out.println("1. Agregar un nuevo contacto");
            System.out.println("2. Buscar contacto existente");
            System.out.println("3. Editar contacto existente");
            System.out.println("4. Eliminar contacto existente");
            System.out.println("0. Salir");
            System.out.print("Ingresa la opción: ");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    //agregarContacto();
                    break;
                case 2:
                    //buscarContacto();
                    break;
                case 3:
                    //editarContacto();
                    break;
                case 4:
                    //eliminarContacto();
                    break;
                case 0:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

}
