package ProductosBebe;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class RegistroProductos {
    
    ArrayList<Productos> productos;
    
    public RegistroProductos(){
        productos = new ArrayList<Productos>();
    }
    
    
    
    public void agregarProductos(Productos nuevoProducto){
        if (this.verificarProducto(nuevoProducto.getCodigo()) == false) {
            productos.add(nuevoProducto);
            
            
        } else {
            System.out.println("Producto existe");
        }
    }
    

    public void listar(){
        for (Productos temporalProducto : productos) {
            System.out.println(temporalProducto.toString());
            
        }
    }
    
    
    
    public boolean verificarProducto(int codigo){
        boolean existe = false;
        for (Productos temporalProductos : productos) {
            if (temporalProductos.getCodigo()==codigo) {
                existe = true;
                break;    
            }
            
        }
        return existe;
    }
    
    
    public void eliminarProducto(String nombre){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getDescripcion().equals(nombre)) {
                productos.remove(i);
                i = i - 1;
                
            }
            
        }
    }
    
    
    
    
    
    
}
