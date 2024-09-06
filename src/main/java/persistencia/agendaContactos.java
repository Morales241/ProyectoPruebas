package persistencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author tacot
 */
public class agendaContactos {

    protected static agendaContactos instance;

    private final List<contacto> Contactos;

    private agendaContactos() {

        Contactos = new ArrayList<>();
    }

    public static agendaContactos getInstance() {

        if (instance == null) {
            return instance = new agendaContactos();
        }
        return instance;

    }

    public List<contacto> getContactos() {
        return Contactos;
    }

    public void agregarContacto(contacto Contacto) {
        this.Contactos.add(Contacto);
    }

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
            throw new Exception("El telefono no fue encontrado en la lista");
        }

    }

    public List<contacto> buscarContactos(String cadena) {
        List<contacto> ContactosResultantes = new ArrayList<>();

        Contactos.forEach(contacto -> {
            if (contacto.getNumero().contains(cadena) || contacto.getNombre().contains(cadena)) {

                ContactosResultantes.add(contacto);
            }
        });

        return ContactosResultantes;
    }

    public contacto seleccionarContacto(int posicion, List<contacto> contactos) {
        return contactos.get(posicion);
    }

    public void modificarContacto(contacto ContactoExistente, contacto ContactoModificado) {

        int posicion = Contactos.indexOf(ContactoExistente);

        Contactos.set(posicion, ContactoModificado);
    }
;

}
