
package minimarket;

/**
 *
 * @author andre
 */
public class Liquido extends Producto {
    
    private int gradosAlcohol;

    public Liquido() {
    }

    public Liquido(int gradosAlcohol, int codigo, int cantidad, double precio, String descripcion) {
        super(codigo, cantidad, precio, descripcion);
        this.gradosAlcohol = gradosAlcohol;
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    @Override
    public String toString() {
        return "Liquido{" + "gradosAlcohol=" + gradosAlcohol + '}';
    }
    
  
    @Override
    public void listar() {
        
        System.out.println(super.toString() + toString());
        
    }
    
    
    
    @Override
    public void comentario(String comentario){
        System.out.println("Comentario de la Liquido: " + comentario);
        
    }
    
}
