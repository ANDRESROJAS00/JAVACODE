
package ProductosBebe;

/**
 *
 * @author andre
 */
public class Perfumeria extends Productos {
    
    private int ml;
    private char aroma;

    public Perfumeria() {
    }

    public Perfumeria(int ml, char aroma, int codigo, int precio, int cantidad, String nombre, String descripcion) {
        super(codigo, precio, cantidad, nombre, descripcion);
        this.ml = ml;
        this.aroma = aroma;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public char getAroma() {
        return aroma;
    }

    public void setAroma(char aroma) {
        if (aroma == 'V' || aroma == 'F' || aroma == 'L') {
            this.aroma = aroma;
            
        } else {
            System.out.println("El tipo debe ser [V] Vainilla o [F] Frutilla o [L] Limon");
        }
        
    }
    
 
    public void mostrarDatos() {
         System.out.println(super.toString() + "Perfumeria{" + "ml=" + ml + ", aroma=" + aroma + '}');
    }
    
    
    
  

    @Override
    public int contarProducto() {
        int cant=0;
        if (getNombre().equalsIgnoreCase("cremas")) {
            System.out.println("Cantidad de cremas " + getCantidad());
        }
        return cant;
    }

    @Override
    public int calcularPrecioFinal(int precio) {
        int descuento = 0;
        descuento = (int) (precio * Calculable.descuento);
        return descuento;
    }
    
}
