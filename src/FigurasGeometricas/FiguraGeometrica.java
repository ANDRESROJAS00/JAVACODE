
package FigurasGeometricas;

/**
 *
 * @author andre
 */
public abstract class FiguraGeometrica {
    
    protected double calcularArea, calcularPerimetro;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(double calcularArea, double calcularPerimetro) {
        this.calcularArea = calcularArea;
        this.calcularPerimetro = calcularPerimetro;
    }

    public double getCalcularArea() {
        return calcularArea;
    }

    public void setCalcularArea(double calcularArea) {
        this.calcularArea = calcularArea;
    }

    public double getCalcularPerimetro() {
        return calcularPerimetro;
    }

    public void setCalcularPerimetro(double calcularPerimetro) {
        this.calcularPerimetro = calcularPerimetro;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "calcularArea=" + calcularArea + ", calcularPerimetro=" + calcularPerimetro + '}';
    }
    
    
    
  

}
