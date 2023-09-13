
package listaempleados;

/**
 *
 * @author andre
 */
public class Puesto {
    
    private String nombre;
    private int codigo;

    public Puesto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Puesto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Puesto{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
    
    
    
}
