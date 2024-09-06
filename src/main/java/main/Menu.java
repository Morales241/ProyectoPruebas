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
    
    public static void main(String[] args) {
        Menu menu= new Menu();
        int opcion;

        do {
            System.out.println("--- Bienvenido a tu agenda de contactos ---");
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
    
    public void agregarContacto(){
        try{
        String nombre, correo, telefono;
        
        System.out.println(" Ingrese el nombre del nuevo contacto");
        System.out.println("(El nombre solo tiene que tener letras)");
        tec.next();
        
        nombre = tec.nextLine();
        
        System.out.println("Ingrese el correo del nuevo contacto");
        System.out.println("(El correo debe de contar con la extencion \"@\" )");
        correo = tec.nextLine();
        
        System.out.println("Ingrese el numero telefonico del nuevo contacto");
        System.out.println("(El numero debe de contar con la 10 caracteres numericos)");
        telefono = tec.nextLine();
        
        
        control.agregarContacto(nombre, correo, telefono);
        
        }catch(Exception ex){
            System.out.println("Algo salió mal: "+ex.getMessage());
        }
    }

}
