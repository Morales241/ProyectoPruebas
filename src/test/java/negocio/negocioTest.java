/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package negocio;

import java.util.ArrayList;
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

    private contacto contactoDefault;
    private negocio instance;

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
        contactoDefault = new contacto("Juan", "juan@gmail.com", "1234567890");
        instance = new negocio();
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
        String nombre = contactoDefault.getNombre();
        String correo = contactoDefault.getCorreo();
        String numero = contactoDefault.getNumero();
        negocio instance = new negocio();
        instance.agregarContacto(nombre, correo, numero);
    }

    /**
     * Test of eliminarContacto method, of class negocio.
     */
    @Test
    public void testEliminarContacto() throws Exception {
        System.out.println("agregarContacto");
        String nombre = contactoDefault.getNombre();
        String correo = contactoDefault.getCorreo();
        String telefono = contactoDefault.getNumero();
        negocio instance = new negocio();
        instance.agregarContacto(nombre, correo, telefono);

        System.out.println("eliminarContacto");
        instance.eliminarContacto(telefono);

        List<contacto> result = instance.buscarTelefono(telefono);
        assertFalse(result.isEmpty(), "El contacto no fue eliminado correctamente.");
    }

    @Test
    public void testBuscarNombre() throws Exception {
        System.out.println("agregarContacto");
        String nombre = "Juan";
        String correo = "juan@gmail.com";
        String telefono = "1234567890";
        negocio instance = new negocio();
        instance.agregarContacto(nombre, correo, telefono);

        System.out.println("buscarNombre");
        contacto expectedContact = new contacto(nombre, correo, telefono);
        List<contacto> expResult = new ArrayList<>();
        expResult.add(expectedContact);
        List<contacto> result = instance.buscarNombre(nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarTelefono method, of class negocio.
     */
    @Test
    public void testBuscarTelefono() throws Exception {
        System.out.println("agregarContacto");
        String nombre = "Juan";
        String correo = "juan@gmail.com";
        String telefono = "1234567890";
        negocio instance = new negocio();
        instance.agregarContacto(nombre, correo, telefono);

        System.out.println("buscarTelefono");
        contacto expectedContact = new contacto(nombre, correo, telefono);
        List<contacto> expResult = new ArrayList<>();
        expResult.add(expectedContact);
        List<contacto> result = instance.buscarTelefono(telefono);
        assertEquals(expResult, result);
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
    }

}
