package EmpresaProductos;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class JefedeZona extends Empleado {

    private Secretario secretario;
    private ArrayList<Vendedor> listaVendedor;
    private Coche coche;

    public JefedeZona() {
    }

    public JefedeZona(Secretario secretario, Coche coche, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.secretario = secretario;
        this.listaVendedor = new ArrayList<Vendedor>();
        this.coche = coche;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public ArrayList<Vendedor> getListaVendedor() {
        return listaVendedor;
    }

    public void setListaVendedor(ArrayList<Vendedor> listaVendedor) {
        this.listaVendedor = listaVendedor;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho de Secretario    = " + secretario.getDespacho());
        System.out.println("Matricula del coche       = " + coche.getMatricula());
        System.out.println("Secretario              = " + secretario);
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;

    }
    
    
    
    public void cambiarCoche(String matricula, String marca, String modelo){
        this.coche = new Coche(matricula, marca, modelo);      
    }
    
    
    
    public void darDeAltaVendedor(Vendedor vendedor){
        listaVendedor.add(vendedor);
    }
    
    public void darDeBajaVendedor(Vendedor vendedor){
        listaVendedor.remove(vendedor);
    }
    
    
    public void incrementarSalario(){
        double aumento = this.getSalario() * 0.2;
        this.setSalario(this.getSalario() + aumento);
        
    }

}
