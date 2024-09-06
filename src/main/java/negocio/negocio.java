package negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tacot
 */
public class negocio {
    
    public void agregarContacto(String nombre, String correo, String telefono) throws Exception{
         
        
        Pattern patternNombre = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");
        Matcher matcherNombre = patternNombre.matcher(nombre);

        Pattern patternCorreo = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcherCorreo = patternCorreo.matcher(correo);
        
        Pattern patternTelefono = Pattern.compile("^\\d{10}$");
        Matcher matcherTelefono = patternTelefono.matcher(telefono);
        
        if (!matcherNombre.matches()) {
            
            throw new Exception("El nombre de ");
            
        }else if (!matcherCorreo.matches()) {
            
            
        }else if (!matcherTelefono.matches()) {
            
            
        }
        
    }
}
