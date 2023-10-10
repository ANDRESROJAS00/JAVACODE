package minimarket;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Coleccion {

    private ArrayList<Producto> listaProducto;

    public Coleccion() {
        listaProducto = new ArrayList<>();
    }

    public boolean agregarProducto(Producto producto) {

        return listaProducto.add(producto);

    }

    public void listaCompra() {
        for (Producto producto : listaProducto) {
            System.out.println("\n.-.-.-.-.-.-.-.-. Canasta  -.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println("Codigo: " + producto.getCodigo());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descripcion: " + producto.getDescripcion());
            double totalProducto = producto.getPrecio() * producto.getCantidad();
            System.out.println(".-.-.-.-.-.-.-.-.-. Total del producto -.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println("Total del producto = " + totalProducto);
        }
        totalProductos(); // Llama a la función para imprimir el total de todos los productos
    }

    public void totalProductos() {
        double suma = 0;
        for (Producto producto : listaProducto) {
            suma += producto.getPrecio() * producto.getCantidad();
        }
        System.out.println("El total de todos los productos es: " + suma);
    }

}
