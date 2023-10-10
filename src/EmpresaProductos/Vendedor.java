
package EmpresaProductos;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Vendedor extends Empleado {
    
    
    private String matricula, marca, modelo;
    private String telefonoMovil, areaVenta;
    private ArrayList<Cliente> listaCliente;
    private double porcentajeComision;

    public Vendedor() {
    }

    public Vendedor(String matricula, String marca, String modelo, String telefonoMovil, String areaVenta, double porcentajeComision, String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.listaCliente = new ArrayList<>();
        this.porcentajeComision = porcentajeComision;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    
    
    
    
    
    public void darAltaCliente(Cliente  cliente){
        listaCliente.add(cliente);
        System.out.println("Ingreso del cliente exitoso");
        
    }
    
    public void darBajaCliente(Cliente cliente){
        listaCliente.remove(cliente);
        System.out.println("El cliente se a dado de baja");
    }
    
    public void cambiarDeCoche(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
    
    
    
    
    
}
