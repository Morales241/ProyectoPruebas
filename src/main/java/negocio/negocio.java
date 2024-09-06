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
    
    
    public void agregarContacto(String nombre, String correo, String telefono) throws Exception{
         
        
        
        
        if (!Validadores.getInstance().validarNombre(nombre)) {
            
            throw new Exception("El nombre de ");
            
        }else if (!Validadores.getInstance().validarTelefono(telefono)) {
            
            
        }else if (!Validadores.getInstance().validarCorreo(correo)) {
            
            
        }
        
    }
    
    public void eliminarContacto(String telefono) throws Exception{
        
        
        
        
        if (!Validadores.getInstance().validarTelefono(telefono)) {
            throw  new Exception("El telefono no venia con el formato predeterminado");
        }
        agendaContactos.getInstance().eliminarContacto(telefono);
        
    }
    
    public void buscarNombre(String nombre) throws Exception{
        
        if (!Validadores.getInstance().validarNombre(nombre)) {
            
            throw new Exception("Este no es un nombre de contacto ");
            
        }
        List<contacto> listaContactos = agendaContactos.getInstance().buscarContactos(nombre);
        
        for(contacto c: listaContactos){
            System.out.println(c);
        }
    }
    
    public void buscarTelefono(String telefono) throws Exception{
        
        if (!Validadores.getInstance().validarTelefono(telefono)) {
            throw new Exception("Este telefono no cumple con el formato");
        }
        List<contacto> listaContactos = agendaContactos.getInstance().buscarContactos(telefono);
        
        System.out.println(listaContactos.get(0));
    }
    
    
}
