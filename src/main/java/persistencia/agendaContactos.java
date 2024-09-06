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

    public agendaContactos() {

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

    public void eliminarContacto(contacto Contacto) {

        for (contacto Contacto1 : Contactos) {

        }

    }

    public List<contacto> buscarContactos(String cadena) {
        List<contacto> ContactosResultantes = new ArrayList<>();

        Contactos.forEach(contacto -> {
            if (contacto.getCorreo().contains(cadena) || contacto.getNombre().contains(cadena)) {

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
