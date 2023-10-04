package ejercicioferreteria;

/**
 *
 * @author andre
 */
public class Martillo extends Producto {

    private char tamano;

    public Martillo() {
    }

    public Martillo(char tamano, int codigo, int stock, int precio, String tipo, String marca) {
        super(codigo, stock,precio, tipo, marca);
        this.setTamano(tamano);
    }

    public char getTamano() {
        return tamano;
    }

    public void setTamano(char tamano) {
        if (tamano == 'G' || tamano == 'P') {
            this.tamano = tamano;
            
        }else{
            System.out.println("Debe ingresar P: pequeño o G: grande");
        }
        
    }

    @Override
    public String toString() {
        return "Martillo{" + "tamano=" + tamano + '}'+ " : " + super.toString();
    }
    
    
    
    @Override
    public int calcularDescuento(String dia) {
        int descuento = 0;
        dia = dia.toUpperCase();
        if (dia.equals("Viernes")) {
            descuento = (int)(super.precio * ProductoDescontable.porcentajeDescuento);
            
        }
        return descuento;
    }
    
}
