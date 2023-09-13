
package listaempleados;

/**
 *
 * @author andre
 */
public class TestEmpresa {
    public static void main(String[] args) {
        
        
        
       Puesto puesto1 = new Puesto("Junior", 12300);
       Puesto puesto2 = new Puesto("Senior", 12340);
       
       Empleado empleado1 = new Empleado(3, 20, "Pedro", "11-11", 'M', puesto2);
       Empleado empleado2 = new Empleado(5, 30, "Lana", "22-22", 'F', puesto1);
       
       Empresa empresa = new Empresa();
       
       
        if (empresa.encontrarEmpleado(empleado1.getRut()) == false) {
            empresa.agregarEmpleado(empleado1);
            System.out.println("El empleado " + empleado1.getNombreEmpleado() + " fue agregado con exito");
            
        } else {
            System.out.println("El empleado ya fue agregado");
        }
           
       
        if (empresa.encontrarEmpleado(empleado2.getRut()) == false) {
            empresa.agregarEmpleado(empleado2);
            System.out.println("El empleado " + empleado2.getNombreEmpleado() + " fue agregado");
            
        } else {
            System.out.println("El empleado ya fue agregado");
        }
        
        
        
        empresa.listarEmpleado();
        
        empresa.eliminarEmpleado(empleado1.getRut());
        
        
        
    }
    
}
