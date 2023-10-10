package minimarket;

/**
 *
 * @author andre
 */
public abstract class Producto implements Comentario {

    protected int codigo, cantidad;
    protected double precio;
    protected String descripcion;

    public Producto() {
    }

    public Producto(int codigo, int cantidad, double precio, String descripcion) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }

  
    public abstract void listar();
    
    
    
    
    

}
