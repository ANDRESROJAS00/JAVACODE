package FigurasGeometricas;

/**
 *
 * @author andre
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        
        Circulo cir = new Circulo(20);
        
        System.out.println("Area del circulo: " + cir.getCalcularArea());
        System.out.println("Perimetro del ciruclo: " + cir.getCalcularPerimetro());
        
        Cuadrado cua = new Cuadrado(10, 10);
        
        System.out.println("Area del cuadrado: " + cua.getCalcularArea());
        System.out.println("Perimetro del cuadrado: " + cua.getCalcularPerimetro());
        
    }
    
}
