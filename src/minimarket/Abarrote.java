package minimarket;

/**
 *
 * @author andre
 */
public class Abarrote extends Producto {

    private int pesoKg;

    public Abarrote() {
    }

    public Abarrote(int pesoKg, int codigo, int cantidad, double precio, String descripcion) {
        super(codigo, cantidad, precio, descripcion);
        this.pesoKg = pesoKg;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public String toString() {
        return "Abarrote{" + "pesoKg=" + pesoKg + '}';
    }

    @Override
    public void listar() {
        System.out.println("""
                           -.-.-.-.- Lista Abarrote -.-.-.-.-
                           Codigo: """ + super.codigo + "\n Cantidad: " + super.cantidad + "\n Precio: " + super.precio + "\n Peso Kg" + pesoKg + "\n Descripcion: " + super.descripcion);
    }
    
    @Override
    public void comentario(String comentario){
        System.out.println("Comentario de la Abarrote: " + comentario);
        
    }

    

    
    
    
    

}
