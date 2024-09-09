package presentación;

import java.util.Scanner;
import negocio.negocio;
import persistencia.contacto;

/**
 * Clase que represenrta el menu del programa
 * @author Equipo: ponle como sea bro
 */
public class Menu {

    static Scanner tec = new Scanner(System.in);
    static negocio control = new negocio();
    static Menu menu = new Menu();

    /**
     * Este es el menú principal del programa
     */
    public void Menu() {

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
                    menu.editarContacto();
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

    /**
     * Submenu para agregar un nuevo contacto
     */
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

            System.out.println("El contacto se agrego correctamente!");
        } catch (Exception ex) {
            System.out.println("Algo salió mal: " + ex.getMessage());
        }
    }

    /**
     * Submenu para eliminar un contacto ya existente
     */
    public void eliminarContacto() {
        try {
            String telefono;

            System.out.println(" Ingrese el telefono del contacto que quiera eliminar");
            tec.nextLine();
            telefono = tec.nextLine();

            control.eliminarContacto(telefono);

            System.out.println("El contacto se elimino correctamente!");

        } catch (Exception ex) {
            System.out.println("Algo salió mal: " + ex.getMessage());
        }
    }

    /**
     * Submenu para buscar contacto
     */
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

    /**
     * Submenu para buscar contacto por nombre
     */
    public void buscarContactoPorNombre() {
        String busqueda;
        try {
            System.out.println("\nIngrese el nombre del contacto");
            tec.nextLine();
            busqueda = tec.nextLine();

            if (!control.buscarNombre(busqueda).isEmpty()) {
                System.out.println("La lista de los contactos es la siguiente:");
            }

            control.buscarNombre(busqueda).forEach(contacto -> {
                System.out.println(contacto);
            });
        } catch (Exception ex) {
            System.out.println("Algo salió mal: " + ex.getMessage());
        }
    }

    /**
     * Submenu para buscar contacto por telefono
     */
    public void buscarContactoPorTelefono() {
        String busqueda;
        try {
            System.out.println("\nIngrese el telefono del contacto");
            tec.nextLine();
            busqueda = tec.nextLine();

            if (!control.buscarTelefono(busqueda).isEmpty()) {
                System.out.println("La lista de los contactos es la siguiente:");
            }

            control.buscarTelefono(busqueda).forEach(contacto -> {
                System.out.println(contacto);
            });
        } catch (Exception ex) {
            System.out.println("Algo salió mal: " + ex.getMessage());
        }
    }

    /**
     * Submenu para editar un contacto 
     */
    public void editarContacto() {

        int opcion = 1;
        String nombre, correo, telefono;

        control.traerTodosLosContactos().forEach(contacto -> {
            System.out.println((control.traerTodosLosContactos().indexOf(contacto) + 1) + ". " + contacto.getNombre());
        });

        System.out.println("Seleccione un contacto por el numero de lista");

        int numeroC = tec.nextInt();

        contacto resultado = control.seleccionarContacto(numeroC);

        nombre = resultado.getNombre();
        correo = resultado.getCorreo();
        telefono = resultado.getNumero();

        do {
            System.out.println(resultado.getNombre());
            System.out.println("--\nSeleccione la caracteristica que quiere cambiar--");
            System.out.println("1. nombre");
            System.out.println("2. correo");
            System.out.println("3. telefono");
            System.out.println("0. regresar");
            tec.nextLine();
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Inserte el nuevo nombre");
                    tec.nextLine();
                    nombre = tec.nextLine();
                    control.editarContacto(resultado, nombre, correo, telefono);
                    break;

                case 2:
                    System.out.println("Inserte el nuevo correo");
                    tec.nextLine();
                    correo = tec.nextLine();
                    control.editarContacto(resultado, nombre, correo, telefono);
                    break;

                case 3:
                    System.out.println("Inserte el nuevo telefono");
                    tec.nextLine();
                    telefono = tec.nextLine();
                    control.editarContacto(resultado, nombre, correo, telefono);
                    break;

                case 0:
                    System.out.println("Regresar");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        } while (opcion != 0);
    }
    

}
