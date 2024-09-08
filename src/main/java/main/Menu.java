package main;

import java.util.Scanner;
import negocio.negocio;

/**
 *
 * @author tacot
 */
public class Menu {

    static Scanner tec = new Scanner(System.in);
    static negocio control = new negocio();
    static Menu menu = new Menu();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n\n--- Bienvenido a tu agenda de contactos ---");
            System.out.println("--- Elige una de las siguientes opciones ---");
            System.out.println("1. Agregar un nuevo contacto");
            System.out.println("2. Buscar contacto existente");
            System.out.println("3. Editar contacto existente");
            System.out.println("4. Eliminar contacto existente");
            System.out.println("0. Salir");
            System.out.println("Ingresa la opción: ");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    menu.agregarContacto();
                    break;
                case 2:
                    menu.buscarContacto();
                    break;
                case 3:
                    //editarContacto();
                    break;
                case 4:
                    menu.eliminarContacto();
                    break;
                case 0:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }

    public void agregarContacto() {
        try {
            String nombre, correo, telefono;

            System.out.println(" Ingrese el nombre del nuevo contacto");
            System.out.println("(El nombre solo tiene que tener letras)");
            tec.nextLine();
            nombre = tec.nextLine();

            System.out.println("Ingrese el correo del nuevo contacto");
            System.out.println("(El correo debe de contar con la extencion \"@\" )");
            correo = tec.nextLine();

            System.out.println("Ingrese el numero telefonico del nuevo contacto");
            System.out.println("(El numero debe de contar con la 10 caracteres numericos)");
            telefono = tec.nextLine();

            control.agregarContacto(nombre, correo, telefono);

        } catch (Exception ex) {
            System.out.println("Algo salió mal: " + ex.getMessage());
        }
    }

    public void eliminarContacto() {
        try {
            String telefono;

            System.out.println(" Ingrese el telefono del contacto que quiera eliminar");
            tec.nextLine();
            telefono = tec.nextLine();

            control.eliminarContacto(telefono);

        } catch (Exception ex) {
            System.out.println("Algo salió mal: " + ex.getMessage());
        }
    }

    public void buscarContacto() {

        int opcion;

        do {
            System.out.println("\n\n--- Seleccione una opcion ---");
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por telefono");
            System.out.println("0. regresar");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    menu.buscarContactoPorNombre();
                    break;
                case 2:
                    menu.buscarContactoPorTelefono();
                    break;
                case 0:
                    opcion = 0;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }

    public void buscarContactoPorNombre() {
        String busqueda;
        try {
            System.out.println("\nIngrese el nombre del contacto");
            tec.nextLine();
            busqueda = tec.nextLine();

            control.buscarNombre(busqueda).forEach(contacto -> {
                System.out.println(contacto);
            });
        } catch (Exception ex) {
            System.out.println("Algo salió mal: " + ex.getMessage());
        }
    }

    public void buscarContactoPorTelefono() {
        String busqueda;
        try {
            System.out.println("\nIngrese el telefono del contacto");
            tec.nextLine();
            busqueda = tec.nextLine();

            control.buscarTelefono(busqueda).forEach(contacto -> {
                System.out.println(contacto);
            });
        } catch (Exception ex) {
            System.out.println("Algo salió mal: " + ex.getMessage());
        }
    }

}
