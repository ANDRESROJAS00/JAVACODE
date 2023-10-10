
package minimarket;

/**
 *
 * @author andre
 */
public class Aseo extends Producto {
    
    private boolean esToxico;

    public Aseo() {
    }

    public Aseo(boolean esToxico, int codigo, int cantidad, double precio, String descripcion) {
        super(codigo, cantidad, precio, descripcion);
        this.esToxico = esToxico;
    }

    public boolean isEsToxico() {
        return esToxico;
    }

    public void setEsToxico(boolean esToxico) {
        this.esToxico = esToxico;
    }

    @Override
    public String toString() {
        return "Aseo{" + "esToxico=" + esToxico + '}';
    }

    @Override
    public void listar() {
        System.out.println(super.toString() + toString());
    }
    
    
    @Override
    public void comentario(String comentario){
        System.out.println("Comentario de la Aseo: " + comentario);
        
    }
    
    
    
    
    
}
