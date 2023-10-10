package registrodevehivulos;

/**
 *
 * @author andre
 */
public class TodoTerreno extends Vehiculo {

    private String traccion;
    private int despeje;

    public TodoTerreno() {
    }

    public TodoTerreno(String traccion, int despeje, String patente, String modelo, Categoria categoria) {
        super(patente, modelo, categoria);
        this.despeje = despeje;
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;

    }

    public void setTraccion(String traccion) {
        if (traccion.equals("AWD") || traccion.equals("4WD")) {
            this.traccion = traccion;
        }
        
    }

    public int getDespeje() {
        return despeje;
    }

    public void setDespeje(int despeje) {
        this.despeje = despeje;
    }

    @Override
    public void imprimir() {
        System.out.println("************ T O D O - T E R R E N O ************");
        super.imprimir();
        if (traccion.equals("AWD") || traccion.equals("4WD")) {
            System.out.println("traccion = " + this.traccion);
        } else {
            System.out.println("Tipo de traccion no valido. Debe ser AWD o 4WD.");
        }
        System.out.println("despeje = " + despeje);
    }

}
