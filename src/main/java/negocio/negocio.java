package negocio;

import java.util.List;
import java.util.Objects;
import persistencia.agendaContactos;
import persistencia.contacto;
import validador.Validadores;

/**
 * Clase que representa la lógica de negocio para gestionar contactos.
 * 
 * @author Equipo: ponle como sea bro
 */
public class negocio {
    
    Validadores validador = Validadores.getInstance();
    agendaContactos agenda = agendaContactos.getInstance();
    
    /**
     * Agrega un nuevo contacto a la agenda.
     * 
     * @param nombre Nombre del contacto.
     * @param correo Correo electrónico del contacto.
     * @param telefono Número de teléfono del contacto.
     * @throws Exception Si el nombre, teléfono o correo no cumplen con el formato esperado.
     */
    public void agregarContacto(String nombre, String correo, String telefono) throws Exception {
        if (!validador.validarNombre(nombre)) {
            throw new Exception("El nombre no cumple con el formato.");
        } else if (!validador.validarTelefono(telefono)) {
            throw new Exception("El teléfono no cumple con el formato.");
        } else if (!validador.validarCorreo(correo)) {
            throw new Exception("El correo no cumple con el formato.");
        }
        agenda.agregarContacto(nombre, correo, telefono);
    }
    
    /**
     * Elimina un contacto de la agenda.
     * 
     * @param telefono Número de teléfono del contacto a eliminar.
     * @throws Exception Si el teléfono no cumple con el formato esperado.
     */
    public void eliminarContacto(String telefono) throws Exception {
        if (!validador.validarTelefono(telefono)) {
            throw new Exception("El teléfono no cumple con el formato predeterminado.");
        }
        agenda.eliminarContacto(telefono);
    }
    
    /**
     * Busca contactos por nombre.
     * 
     * @param nombre Nombre del contacto a buscar.
     * @return Lista de contactos que coinciden con el nombre.
     * @throws Exception Si el nombre no es válido.
     */
    public List<contacto> buscarNombre(String nombre) throws Exception {
        if (!validador.validarNombre(nombre)) {
            throw new Exception("Este no es un nombre de contacto válido.");
        }
        return agenda.buscarContactos(nombre);
    }
    
    /**
     * Busca contactos por número de teléfono.
     * 
     * @param telefono Número de teléfono a buscar.
     * @return Lista de contactos que coinciden con el teléfono.
     * @throws Exception Si el teléfono no cumple con el formato esperado.
     */
    public List<contacto> buscarTelefono(String telefono) throws Exception {
        if (!validador.validarTelefono(telefono)) {
            throw new Exception("Este teléfono no cumple con el formato.");
        }
        return agenda.buscarContactos(telefono);
    }
    
    /**
     * Obtiene todos los contactos almacenados en la agenda.
     * 
     * @return Lista de todos los contactos.
     */
    public List<contacto> traerTodosLosContactos() {
        return agenda.getContactos();
    }
    
    /**
     * Selecciona un contacto específico por su índice.
     * 
     * @param index Índice del contacto a seleccionar.
     * @return El contacto seleccionado.
     */
    public contacto seleccionarContacto(int index) {
        return agenda.seleccionarContacto(index);
    }
    
    /**
     * Edita un contacto existente.
     * 
     * @param contectoExistente Contacto a modificar.
     * @param nombre Nuevo nombre del contacto.
     * @param correo Nuevo correo electrónico del contacto.
     * @param telefono Nuevo número de teléfono del contacto.
     */
    public void editarContacto(contacto contectoExistente, String nombre, String correo, String telefono) {
        agenda.modificarContacto(contectoExistente, new contacto(nombre, correo, telefono));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.validador);
        hash = 83 * hash + Objects.hashCode(this.agenda);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final negocio other = (negocio) obj;
        if (!Objects.equals(this.validador, other.validador)) {
            return false;
        }
        return Objects.equals(this.agenda, other.agenda);
    }
    
    
}
