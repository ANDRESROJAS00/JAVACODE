package FigurasGeometricas;

/**
 *
 * @author andre
 */
public class Cuadrado extends FiguraGeometrica {
    
    private double lado1, lado2;

    public Cuadrado() {
    }

    public Cuadrado(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        
    }

    
    
    @Override
    public double getCalcularArea(){
        return lado1*lado2;
    }
    
    @Override
    public double getCalcularPerimetro(){
        return 2*(lado1 * lado2); 
    }
    
    
    
    
    
    
    
    
    
}
