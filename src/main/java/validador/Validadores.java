/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author jl4ma
 */
public class Validadores {
    
    protected static Validadores instance;

    private Validadores() {
    }

    public static Validadores getInstance() {
        if (instance == null) {
            return instance = new Validadores();
        }
        return instance;
    }
    
    
    public boolean validarNombre(String nombre){
        Pattern patternNombre = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");
        Matcher matcherNombre = patternNombre.matcher(nombre);
        
        return matcherNombre.matches();
    }
    
    public boolean validarTelefono(String telefono){
        Pattern patternTelefono = Pattern.compile("^\\d{10}$");
        Matcher matcherTelefono = patternTelefono.matcher(telefono);
        
        return matcherTelefono.matches();
    }
    
    public boolean validarCorreo(String correo){
        Pattern patternCorreo = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcherCorreo = patternCorreo.matcher(correo);
        
        return matcherCorreo.matches();
    }
    
    
}
