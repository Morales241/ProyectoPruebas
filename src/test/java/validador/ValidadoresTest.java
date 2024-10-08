package validador;

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
public class ValidadoresTest {

    public ValidadoresTest() {
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
     * Test of getInstance method, of class Validadores.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Validadores expResult = Validadores.getInstance();
        Validadores result = Validadores.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of validarNombre method, of class Validadores.
     */
    @Test
    public void testValidarNombre() {
        System.out.println("validarNombre");
        String nombre = "jesus";
        Validadores instance = Validadores.getInstance();
        boolean expResult = true;
        boolean result = instance.validarNombre(nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarTelefono method, of class Validadores.
     */
    @Test
    public void testValidarTelefono() {
        System.out.println("validarTelefono");
        String telefono = "1212121212";
        Validadores instance = Validadores.getInstance();
        boolean expResult = true;
        boolean result = instance.validarTelefono(telefono);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarCorreo method, of class Validadores.
     */
    @Test
    public void testValidarCorreo() {
        System.out.println("validarCorreo");
        String correo = "asdas@asdsda";
        Validadores instance = Validadores.getInstance();
        boolean expResult = true;
        boolean result = instance.validarCorreo(correo);
        assertEquals(expResult, result);
    }

}
