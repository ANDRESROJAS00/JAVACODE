
package minimarket;

/**
 *
 * @author andre
 */
public class Oferta extends Producto {
    
    private double descuento;

    public Oferta() {
    }

    public Oferta(double descuento, int codigo, int cantidad, double precio, String descripcion) {
        super(codigo, cantidad, precio, descripcion);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Oferta{" + "descuento=" + descuento + '}';
    }

    @Override
    public void listar() {
        System.out.println(super.toString() + toString());
    } 
    
    @Override
    public void comentario(String comentario){
        System.out.println("Comentario de la oferta: " + comentario);
        
    }
    
    
    
}
