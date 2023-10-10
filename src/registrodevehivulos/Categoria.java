package registrodevehivulos;

/**
 *
 * @author andre
 */
public class Categoria {

    String descripcion;
    int id;

    public Categoria() {
    }

    public Categoria(String descripcion, int id) {
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Categoria{" + "descripcion=" + descripcion + ", id=" + id + '}';
    }

    public void imprimir() {
        System.out.println("id = " + id);
        System.out.println("descripcion = " + descripcion);
    }

}
