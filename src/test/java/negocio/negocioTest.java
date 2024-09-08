/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package negocio;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import persistencia.contacto;

/**
 *
 * @author tacot
 */
public class negocioTest {
    
    public negocioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of agregarContacto method, of class negocio.
     */
    @Test
    public void testAgregarContacto() throws Exception {
        System.out.println("agregarContacto");
        String nombre = "";
        String correo = "";
        String telefono = "";
        negocio instance = new negocio();
        instance.agregarContacto(nombre, correo, telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarContacto method, of class negocio.
     */
    @Test
    public void testEliminarContacto() throws Exception {
        System.out.println("eliminarContacto");
        String telefono = "";
        negocio instance = new negocio();
        instance.eliminarContacto(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNombre method, of class negocio.
     */
    @Test
    public void testBuscarNombre() throws Exception {
        System.out.println("buscarNombre");
        String nombre = "";
        negocio instance = new negocio();
        List<contacto> expResult = null;
        List<contacto> result = instance.buscarNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTelefono method, of class negocio.
     */
    @Test
    public void testBuscarTelefono() throws Exception {
        System.out.println("buscarTelefono");
        String telefono = "";
        negocio instance = new negocio();
        List<contacto> expResult = null;
        List<contacto> result = instance.buscarTelefono(telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosContactos method, of class negocio.
     */
    @Test
    public void testTraerTodosLosContactos() {
        System.out.println("traerTodosLosContactos");
        negocio instance = new negocio();
        List<contacto> expResult = null;
        List<contacto> result = instance.traerTodosLosContactos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarContacto method, of class negocio.
     */
    @Test
    public void testSeleccionarContacto() {
        System.out.println("seleccionarContacto");
        int index = 0;
        negocio instance = new negocio();
        contacto expResult = null;
        contacto result = instance.seleccionarContacto(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarContacto method, of class negocio.
     */
    @Test
    public void testEditarContacto() {
        System.out.println("editarContacto");
        contacto contectoExistente = null;
        String nombre = "";
        String correo = "";
        String telefono = "";
        negocio instance = new negocio();
        instance.editarContacto(contectoExistente, nombre, correo, telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
