
package ProductosBebe;

/**
 *
 * @author andre
 */
public abstract class Productos  implements Calculable{
    
    
    protected int codigo, precio, cantidad;
    protected String nombre, descripcion;

    public Productos() {
    }

    public Productos(int codigo, int precio, int cantidad, String nombre, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio>0) {
            this.precio = precio;
            
        } else {
            System.out.println("precio debe ser mayor a cero");
        }
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        int largo;
        largo = nombre.length();
        if (largo > 0) {
            this.nombre = nombre;
        
            
        }else{
            System.out.println("El nombre de debe venir en blanco");
        }
        this.nombre = nombre;
    }
 
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
   
    public abstract int contarProducto();
        
   
    public int calcularTotal(int cantidad){
        int total = 0;
        int descuento = 0;
        
        descuento = calcularPrecioFinal(precio);
        total = this.precio * cantidad - descuento * cantidad;
        return total;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
