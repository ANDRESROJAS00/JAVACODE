/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductosBebe;

/**
 *
 * @author andre
 */
public class Alimentos extends Productos {
    
    
    private char tipo;
    private int pesogramos;

    public Alimentos() {
    }

    public Alimentos(char tipo, int pesogramos, int codigo, int precio, int cantidad, String nombre, String descripcion) {
        super(codigo, precio, cantidad, nombre, descripcion);
        this.tipo = tipo;
        this.pesogramos = pesogramos;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        if (tipo == 'L' || tipo == 'C') {
            this.tipo = tipo;
            
        } else {
            System.out.println("El tipo debe ser [L] Leche o [C] Colado");
        }
        this.tipo = tipo;
    }

    public int getPesogramos() {
        return pesogramos;
    }

    public void setPesogramos(int pesogramos) {
        this.pesogramos = pesogramos;
    }

    @Override
    public String toString() {
        return "Alimentos{" + "tipo=" + tipo + ", pesogramos=" + pesogramos + '}';
    }

 
    @Override
    public int contarProducto() {
        int cant=0;
            if (tipo == 'L') {
                System.out.println("Cantidad de leche " + getCantidad());  
        }
            return cant;
        
    }
    
    
    @Override
    public int calcularPrecioFinal(int precio){
        int descuento = 0;
        descuento = (int) (precio-(precio * Calculable.descuento));
        return descuento;
    }
    
    
    public void mostrarDatos(){
        System.out.println(super.toString()+"Alimentos " + "tipo=" + tipo + ", pesogramos=" + pesogramos);
    }
    
    
    
    
    
    
    
    
    
}
