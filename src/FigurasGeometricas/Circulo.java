
package FigurasGeometricas;

/**
 *
 * @author andre
 */
public class Circulo extends FiguraGeometrica {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getCalcularArea() {
        return Math.PI * Math.pow(radio, 2); 
    }

 
    @Override
    public double getCalcularPerimetro() {
        return 2 * Math.PI * radio; 
    }

    
    
}
