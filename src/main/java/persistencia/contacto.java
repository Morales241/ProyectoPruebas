package persistencia;

/**
 * Clase que representa un contacto en la agenda.
 * Contiene información como nombre, correo electrónico y número de teléfono.
 * 
 * @author Equipo: ponle como sea bro
 */
public class contacto {
    
    private String nombre, correo, numero;
    
    public contacto(){
        // Constructor vacío
    }

    /**
     * Constructor para crear un nuevo contacto con datos iniciales.
     * 
     * @param nombre Nombre del contacto.
     * @param correo Correo electrónico del contacto.
     * @param numero Número de teléfono del contacto.
     */
    public contacto(String nombre, String correo, String numero) {
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", correo=" + correo + ", numero=" + numero;
    }
}
