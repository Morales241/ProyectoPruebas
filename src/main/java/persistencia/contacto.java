package persistencia;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.correo);
        hash = 47 * hash + Objects.hashCode(this.numero);
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
        final contacto other = (contacto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return Objects.equals(this.numero, other.numero);
    }
    
    
}
