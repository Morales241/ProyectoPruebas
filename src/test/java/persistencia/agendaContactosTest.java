/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tacot
 */
public class agendaContactosTest {
    
    public agendaContactosTest() {
    }
//
//    @org.junit.jupiter.api.BeforeAll
//    public static void setUpClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterAll
//    public static void tearDownClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterEach
//    public void tearDown() throws Exception {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of getInstance method, of class agendaContactos.
     */
    @org.junit.jupiter.api.Test
    public void testGetInstance() {
        System.out.println("getInstance");
        agendaContactos expResult = agendaContactos.getInstance();
        agendaContactos result = agendaContactos.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getContactos method, of class agendaContactos.
     */
    @org.junit.jupiter.api.Test
    public void testGetContactos() {
        System.out.println("getContactos");
        agendaContactos instance = agendaContactos.getInstance();
        List<contacto> expResult = new ArrayList<>();
        expResult.add(instance.seleccionarContacto(0));
        expResult.add(instance.seleccionarContacto(1));
        
        List<contacto> result = instance.getContactos();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarContacto method, of class agendaContactos.
     */
    @org.junit.jupiter.api.Test
    public void testAgregarContacto() {
        System.out.println("agregarContacto");
        contacto Contacto = new contacto("jesus", "momom@mom", "1212121212");
        agendaContactos instance = agendaContactos.getInstance();
        instance.agregarContacto("jesus", "momom@mom", "1212121212");
    }

    /**
     * Test of eliminarContacto method, of class agendaContactos.
     */
    @org.junit.jupiter.api.Test
    public void testEliminarContacto() throws Exception {
        System.out.println("eliminarContacto");
        agendaContactos instance = agendaContactos.getInstance();
        instance.eliminarContacto("1212121212");
    }

    /**
     * Test of buscarContactos method, of class agendaContactos.
     */
    @org.junit.jupiter.api.Test
    public void testBuscarContactos() {
        System.out.println("buscarContactos");
        String cadena = "jesus";
        agendaContactos instance = agendaContactos.getInstance();
        
        List<contacto> result = instance.buscarContactos(cadena);
        
    }

    /**
     * Test of seleccionarContacto method, of class agendaContactos.
     */
    @org.junit.jupiter.api.Test
    public void testSeleccionarContacto() {
        System.out.println("seleccionarContacto");
        int posicion = 0;
        agendaContactos instance = agendaContactos.getInstance();
        
        instance.agregarContacto("josue", "masa@moas", "2432242323");
        
        contacto expResult = instance.seleccionarContacto(0);
        contacto result = instance.seleccionarContacto(posicion);
        assertEquals(expResult, result);
    }

    /**
     * Test of modificarContacto method, of class agendaContactos.
     */
    @org.junit.jupiter.api.Test
    public void testModificarContacto() {
        System.out.println("modificarContacto");
       
        agendaContactos instance = agendaContactos.getInstance();
        instance.agregarContacto("jesus", "momom@mom", "1212121212");
        contacto ContactoExistente = instance.seleccionarContacto(0);
        
        contacto ContactoModificado = new contacto("madero", "momom@mom", "1212121212");
        instance.modificarContacto(ContactoExistente, ContactoModificado);
    }
    
}
