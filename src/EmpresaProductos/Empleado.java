
package EmpresaProductos;

/**
 *
 * @author andre
 */
public class Empleado {
    
    
    protected String nombre, apellidos, DNI, direccion;
    protected int antiguedad, telefono;
    protected double salario;
    protected Empleado supervisor;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String DNI, String direccion, int antiguedad, int telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    
    
    
    public void imprimir(){
        System.out.println("nombre      = " + nombre);
        System.out.println("apellidos   = " + apellidos);
        System.out.println("DNI         = " + DNI);
        System.out.println("direccion   = " + direccion);
        System.out.println("antiguedad  = " + antiguedad + " anios");
        System.out.println("telefono    = " + telefono);
        System.out.println("salario     = " + salario);
        System.out.println("supervisor  = " +(supervisor != null ? supervisor.getNombreCompleto(): "N/A"));
    }
    
    
    public void cambiarSupervisor(Empleado nuevoSupervisor){
        this.supervisor = nuevoSupervisor;
    }
    
    
    public void incremenrarSalario() {
        double aumento = this.getSalario() * 0.1;
        this.setSalario(this.getSalario() + aumento);
        
        
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellidos; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
