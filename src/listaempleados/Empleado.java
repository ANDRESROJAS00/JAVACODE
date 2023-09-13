
package listaempleados;

/**
 *
 * @author andre
 */
public class Empleado {
    
    private int aniosServicio, edad;
    private String nombreEmpleado,rut;
    private char genero;
    private Puesto puesto;

    public Empleado(int aniosServicio, int edad, String nombreEmpleado, String rut, char genero, Puesto puesto) {
        this.aniosServicio = aniosServicio;
        this.edad = edad;
        this.nombreEmpleado = nombreEmpleado;
        this.rut = rut;
        this.genero = genero;
        this.puesto = puesto;
    }

    public Empleado() {
    }

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "aniosServicio=" + aniosServicio + ", edad=" + edad + ", nombreEmpleado=" + nombreEmpleado + ", rut=" + rut + ", genero=" + genero + ", puesto=" + puesto + '}';
    }
    
    
    

    
    
    
}
