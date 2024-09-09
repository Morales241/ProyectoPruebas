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
import persistencia.agendaContactos;
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
    public void tearDown() throws Exception {

        
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
        
        System.out.println("eliminarContacto");
        String nombre = contactoDefault.getNombre();
        String correo = contactoDefault.getCorreo();
        String telefono = contactoDefault.getNumero();
        negocio instance = new negocio();
        instance.agregarContacto(nombre, correo, telefono);
        instance.eliminarContacto(telefono);
        List<contacto> result = instance.buscarTelefono(telefono);
        assertFalse(result.isEmpty(), "El contacto no fue eliminado correctamente.");
    }

    @Test
    public void testBuscarNombre() throws Exception {
        System.out.println("buscarNombre");
        String nombre = "Juan";
        String correo = "juan@gmail.com";
        String telefono = "1234567890";
        negocio instance = new negocio();
        instance.eliminarContacto(telefono);
        contacto expectedContact = instance.seleccionarContacto(0);
        List<contacto> expResult = new ArrayList<>();
        expResult.add(expectedContact);
        List<contacto> result = instance.buscarNombre(nombre);

        // Verificar que no haya duplicados
        assertEquals(1, result.size(), "Se encontraron contactos duplicados.");
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarTelefono method, of class negocio.
     */
    @Test
    public void testBuscarTelefono() throws Exception {
        System.out.println("buscarTelefono");
        String nombre = "Juan";
        String correo = "juan@gmail.com";
        String telefono = "1234567890";
        negocio instance = new negocio();
        instance.agregarContacto(nombre, correo, telefono);
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
    public void testTraerTodosLosContactos() throws Exception {
        
        System.out.println("TraerTodosLosContactos");
        negocio instance = new negocio();
        int expResult = 2;
        List<contacto> result = instance.traerTodosLosContactos();
        assertEquals(expResult, result.size());
    }

    /**
     * Test of seleccionarContacto method, of class negocio.
     */
    @Test
    public void testSeleccionarContacto() throws Exception {
        
    }

    /**
     * Test of editarContacto method, of class negocio.
     */
    @Test
    public void testEditarContacto() throws Exception {
        System.out.println("editarContacto");
        String nombreOriginal = contactoDefault.getNombre();
        String correoOriginal = contactoDefault.getCorreo();
        String telefonoOriginal = contactoDefault.getNumero();
        String nuevoNombre = "Juanito";
        String nuevoCorreo = "juanito@gmail.com";
        String nuevoTelefono = "0987654321";
        negocio instance = new negocio();
        instance.agregarContacto(nombreOriginal, correoOriginal, telefonoOriginal);
        List<contacto> contactos = instance.buscarTelefono(telefonoOriginal);
        assertFalse(contactos.isEmpty(), "El contacto que se va a editar no se encontró.");
        contacto contactoExistente = contactos.get(0);
        instance.editarContacto(contactoExistente, nuevoNombre, nuevoCorreo, nuevoTelefono);
        List<contacto> resultado = instance.buscarTelefono(nuevoTelefono);
        assertFalse(resultado.isEmpty(), "El contacto no fue editado correctamente.");
        contacto contactoEditado = resultado.get(0);
        assertEquals(nuevoNombre, contactoEditado.getNombre(), "El nombre del contacto editado no es el esperado.");
        assertEquals(nuevoCorreo, contactoEditado.getCorreo(), "El correo del contacto editado no es el esperado.");
        assertEquals(nuevoTelefono, contactoEditado.getNumero(), "El teléfono del contacto editado no es el esperado.");
    }
}
