package persistencia;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una agenda de contactos.
 * Permite agregar, eliminar, buscar y modificar contactos.
 * 
 * @author Equipo: ponle como sea bro
 */
public class agendaContactos {

    protected static agendaContactos instance;
    private final List<contacto> Contactos;

    agendaContactos() {
        Contactos = new ArrayList<>();
    }

    public static agendaContactos getInstance() {
        if (instance == null) {
            return instance = new agendaContactos();
        }
        return instance;
    }

    /**
     * Obtiene la lista de todos los contactos en la agenda.
     * 
     * @return Lista de contactos.
     */
    public List<contacto> getContactos() {
        return Contactos;
    }

    /**
     * Agrega un nuevo contacto a la agenda.
     * 
     * @param nombre Nombre del contacto.
     * @param correo Correo electrónico del contacto.
     * @param telefono Número de teléfono del contacto.
     */
    public void agregarContacto(String nombre, String correo, String telefono) {
        this.Contactos.add(new contacto(nombre, correo, telefono));
    }

    /**
     * Elimina un contacto de la agenda.
     * 
     * @param numero Número de teléfono del contacto a eliminar.
     * @throws Exception Si el teléfono no se encuentra en la agenda.
     */
    public void eliminarContacto(String numero) throws Exception {
        contacto contactoAEliminar = null;
        for (contacto Contacto1 : Contactos) {
            if (Contacto1.getNumero().equalsIgnoreCase(numero)) {
                contactoAEliminar = Contacto1;
                break;
            }
        }
        if (contactoAEliminar != null) {
            Contactos.remove(contactoAEliminar);
        } else {
            throw new Exception("El teléfono no fue encontrado en la agenda.");
        }
    }

    /**
     * Busca contactos por nombre o número de teléfono.
     * 
     * @param cadena Cadena a buscar en los nombres o números de teléfono.
     * @return Lista de contactos que coinciden con la cadena.
     */
    public List<contacto> buscarContactos(String cadena) {
        List<contacto> ContactosResultantes = new ArrayList<>();
        Contactos.forEach(contacto -> {
            if (contacto.getNumero().contains(cadena) || contacto.getNombre().contains(cadena)) {
                ContactosResultantes.add(contacto);
            }
        });
        return ContactosResultantes;
    }

    /**
     * Selecciona un contacto específico por su posición en la lista.
     * 
     * @param posicion Índice del contacto a seleccionar.
     * @return El contacto seleccionado.
     */
    public contacto seleccionarContacto(int posicion) {
        return Contactos.get(posicion);
    }

    /**
     * Modifica un contacto existente en la agenda.
     * 
     * @param ContactoExistente Contacto a modificar.
     * @param ContactoNuevo Nuevo contacto con los datos actualizados.
     */
    public void modificarContacto(contacto ContactoExistente, contacto ContactoNuevo) {
        int posicion = Contactos.indexOf(ContactoExistente);
        Contactos.set(posicion, ContactoNuevo);
    }
}
