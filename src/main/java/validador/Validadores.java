/*
 * Esta clase proporciona métodos para validar nombres, teléfonos y correos electrónicos.
 * 
 * @author Equipo: ponle como sea bro
 */

package validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validadores {
    
    protected static Validadores instance;

    private Validadores() {
        // Constructor privado para implementar el patrón Singleton
    }

    public static Validadores getInstance() {
        if (instance == null) {
            return instance = new Validadores();
        }
        return instance;
    }
    
    /**
     * Valida si un nombre cumple con el formato esperado.
     * @param nombre El nombre a validar.
     * @return true si el nombre es válido, false en caso contrario.
     */
    public boolean validarNombre(String nombre){
        Pattern patternNombre = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");
        Matcher matcherNombre = patternNombre.matcher(nombre);
        
        return matcherNombre.matches();
    }
    
    /**
     * Valida si un número de teléfono cumple con el formato esperado.
     * @param telefono El número de teléfono a validar.
     * @return true si el teléfono es válido, false en caso contrario.
     */
    public boolean validarTelefono(String telefono){
        Pattern patternTelefono = Pattern.compile("^\\d{10}$");
        Matcher matcherTelefono = patternTelefono.matcher(telefono);
        
        return matcherTelefono.matches();
    }
    
    /**
     * Valida si una dirección de correo electrónico cumple con el formato esperado.
     * @param correo El correo electrónico a validar.
     * @return true si el correo es válido, false en caso contrario.
     */
    public boolean validarCorreo(String correo){
        Pattern patternCorreo = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcherCorreo = patternCorreo.matcher(correo);
        
        return matcherCorreo.matches();
    }
}
