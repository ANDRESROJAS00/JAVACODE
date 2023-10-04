package ejercicioferreteria;

/**
 *
 * @author andre
 */
public abstract class Producto implements ProductoDescontable {
    
    protected int codigo, stock, precio;
    protected String tipo, marca;

    public Producto() {
    }

    public Producto(int codigo, int stock, int precio, String tipo, String marca) {
        this.precio = precio;
        this.codigo = codigo;
        this.setStock(stock);
        this.tipo = tipo;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
            
        } else {
            System.out.println("El codigo debe un numero positivo");
        }
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
            
        } else {
            System.out.println("El stock debe ser positivo");
        }
        this.stock = stock;
    }

    
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int precio){
        if (precio > 1000) {
            this.precio = precio;
            
        } else {
            System.out.println("El precio debe ser mayor 1000");
        }
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", stock=" + stock + ", litros=" + ", tipo=" + tipo + ", marca=" + marca + ", tamano="+'}';
    }
    
    
    public boolean validarStockVenta(int cantidadComprar){
        if (cantidadComprar <= this.getStock()) {
            return true;
            
        } else {
            System.out.println("No hay stcok");
            return false;
        }
        
    }
    
    
    
    
    public int calcularTotal(int cantidad, String dia){
        int descuento = 0;
        int total = 0;
        if (this.validarStockVenta(cantidad)) {
            System.out.println(tipo+"Stock anterior " + stock);
            stock = stock - cantidad;
            System.out.println(tipo + "stock actual es: " + stock);
            descuento = calcularDescuento(dia);
            total = this.precio*cantidad - descuento * cantidad;
        } 
        return total;
    }

    
    

   
    
    
    
}
