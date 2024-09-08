package negocio;

import java.util.List;
import persistencia.agendaContactos;
import persistencia.contacto;
import validador.Validadores;

/**
 *
 * @author tacot
 */
public class negocio {
    
    Validadores validador = Validadores.getInstance();
    
    agendaContactos agenda = agendaContactos.getInstance();
    
    public void agregarContacto(String nombre, String correo, String telefono) throws Exception{
         
        if (!validador.validarNombre(nombre)) {
            
            throw new Exception("El nombre no cumple con el formato ");
            
        }else if (!validador.validarTelefono(telefono)) {
            
            throw new Exception("El telefono no cumple con el formato ");
            
        }else if (!validador.validarCorreo(correo)) {
            
            throw new Exception("El correo no cumple con el formato ");
        }else{
            
        }
        agenda.agregarContacto(nombre, correo, telefono);
    }
    
    public void eliminarContacto(String telefono) throws Exception{
        
        if (!validador.validarTelefono(telefono)) {
            throw  new Exception("El telefono no venia con el formato predeterminado");
        }
        agenda.eliminarContacto(telefono);
        
    }
    
    public List<contacto>  buscarNombre(String nombre) throws Exception{
        
        if (!validador.validarNombre(nombre)) {
            
            throw new Exception("Este no es un nombre de contacto ");
            
        }
        return agenda.buscarContactos(nombre);
        
    }
    
    public List<contacto> buscarTelefono(String telefono) throws Exception{
        
        if (!validador.validarTelefono(telefono)) {
            throw new Exception("Este telefono no cumple con el formato");
        }
        return agenda.buscarContactos(telefono);
        
    }
    
    
}
