///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
// */
//package persistencia;
//
//import java.util.List;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// *
// * @author tacot
// */
//public class agendaContactosTest {
//    
//    public agendaContactosTest() {
//    }
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
//
//    /**
//     * Test of getInstance method, of class agendaContactos.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        agendaContactos expResult = null;
//        agendaContactos result = agendaContactos.getInstance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getContactos method, of class agendaContactos.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetContactos() {
//        System.out.println("getContactos");
//        agendaContactos instance = new agendaContactos();
//        List<contacto> expResult = null;
//        List<contacto> result = instance.getContactos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarContacto method, of class agendaContactos.
//     */
//    @org.junit.jupiter.api.Test
//    public void testAgregarContacto() {
//        System.out.println("agregarContacto");
//        contacto Contacto = null;
//        agendaContactos instance = new agendaContactos();
//        instance.agregarContacto(Contacto);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of eliminarContacto method, of class agendaContactos.
//     */
//    @org.junit.jupiter.api.Test
//    public void testEliminarContacto() {
//        System.out.println("eliminarContacto");
//        contacto Contacto = null;
//        agendaContactos instance = new agendaContactos();
//        instance.eliminarContacto(Contacto);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of buscarContactos method, of class agendaContactos.
//     */
//    @org.junit.jupiter.api.Test
//    public void testBuscarContactos() {
//        System.out.println("buscarContactos");
//        String cadena = "";
//        agendaContactos instance = new agendaContactos();
//        List<contacto> expResult = null;
//        List<contacto> result = instance.buscarContactos(cadena);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of seleccionarContacto method, of class agendaContactos.
//     */
//    @org.junit.jupiter.api.Test
//    public void testSeleccionarContacto() {
//        System.out.println("seleccionarContacto");
//        int posicion = 0;
//        List<contacto> contactos = null;
//        agendaContactos instance = new agendaContactos();
//        contacto expResult = null;
//        contacto result = instance.seleccionarContacto(posicion, contactos);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of modificarContacto method, of class agendaContactos.
//     */
//    @org.junit.jupiter.api.Test
//    public void testModificarContacto() {
//        System.out.println("modificarContacto");
//        contacto ContactoExistente = null;
//        contacto ContactoModificado = null;
//        agendaContactos instance = new agendaContactos();
//        instance.modificarContacto(ContactoExistente, ContactoModificado);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
