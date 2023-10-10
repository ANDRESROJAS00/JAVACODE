package registrodevehivulos;

/**
 *
 * @author andre
 */
public class City extends Vehiculo {

    double rendimiento;

    public City() {
    }

    public City(double rendimiento, String patente, String modelo, Categoria categoria) {
        super(patente, modelo, categoria);
        this.setRendimiento(rendimiento);
    }

    public double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(double rendimiento) {
        if (rendimiento >= 10 && rendimiento <= 20) {
            this.rendimiento = rendimiento;
        }
    }

    
    @Override
    public void imprimir() {
        System.out.println("******************* C I T Y - C A R *******************");
        if (rendimiento >= 10 && rendimiento <= 20) {
            super.imprimir();
            System.out.println("rendimiento = " + rendimiento);
            
        } else {
            System.out.println("El rendimiento debe ser entre 10 y 20");
        }        
        //System.out.println("modelo = " + super.getModelo());

    }

}
