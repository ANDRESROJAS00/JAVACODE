
package ProductosBebe;

/**
 *
 * @author andre
 */
public class ProductosBebe {
    public static void main(String[] args) {
        
        Alimentos alimento;
        Perfumeria perfumeria;
        
        
        
        alimento = new Alimentos('L', 500, 1210, 790, 2, "Leche", "sobrole");
        alimento.mostrarDatos();
        System.out.println("Precio Final: " + alimento.calcularPrecioFinal(alimento.getPrecio()));
        alimento.contarProducto();
        
        
        perfumeria = new Perfumeria(100, 'F', 2121, 15000, 3, "Cremas", "Bebesito");
        perfumeria.mostrarDatos();
        System.out.println("Precio Final: " + perfumeria.calcularPrecioFinal(perfumeria.getPrecio()));
        perfumeria.contarProducto();
        
        System.out.println("***************");
        
        
    }
    
}
