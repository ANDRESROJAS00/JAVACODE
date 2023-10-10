package minimarket;

/**
 *
 * @author andre
 */
public class Congelado extends Producto {

    private boolean esRefrigerado;

    public Congelado() {
    }

    public Congelado(boolean esRefrigerado, int codigo, int cantidad, double precio, String descripcion) {
        super(codigo, cantidad, precio, descripcion);
        this.esRefrigerado = esRefrigerado;
    }

    public boolean isEsRefrigerado() {
        return esRefrigerado;
    }

    public void setEsRefrigerado(boolean esRefrigerado) {
        this.esRefrigerado = esRefrigerado;
    }

    @Override
    public String toString() {
        return "Congelado{" + "esRefrigerado=" + esRefrigerado + '}';
    }

    @Override
    public void listar() {
        System.out.println(super.toString() + toString());
    }
    
    
    
    @Override
    public void comentario(String comentario){
        System.out.println("Comentario de la Congelado: " + comentario);
        
    }

}
