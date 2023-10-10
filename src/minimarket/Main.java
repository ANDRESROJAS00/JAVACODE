
package minimarket;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {

        
        
        Abarrote papas = new Abarrote(20, 1, 5, 10000, "Papas granel");
        Liquido cloro = new Liquido(8, 2, 1, 20000, "Jhonny camina");
        
        
        Coleccion col = new Coleccion();
        col.agregarProducto(cloro);
        col.agregarProducto(papas);
        
        
        
        col.listaCompra();
        col.totalProductos();
        
        
        
    }
    
}
