
package EmpresaProductos;

/**
 *
 * @author andre
 */
public class Secretario extends Empleado {
    
    private String despacho, numeroFax;

    public Secretario() {
    }

    public Secretario(String despacho, String numeroFax, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getNumeroFax() {
        return numeroFax;
    }

    public void setNumeroFax(String numeroFax) {
        this.numeroFax = numeroFax;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("despacho    = " + despacho);
        System.out.println("numeroFax   = " + numeroFax);
    }
    
    
    
    
    
    
    
    
    
    
}
