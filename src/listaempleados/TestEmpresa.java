
package listaempleados;

/**
 *
 * @author andre
 */
public class TestEmpresa {
    public static void main(String[] args) {
        
        Puesto puesto1 = new Puesto("Junior", 1);
        Puesto puesto2 = new Puesto("Senior", 22);
        
        Empleado empleado1 = new Empleado(5, 20, "Andres", "1-1", 'm', puesto1);
        Empleado empleado2 = new Empleado(11, 35, "CATA", "2-2", 'F', puesto2);
        
        
        Empresa empresa = new Empresa();
        
        
        
        
        if (empresa.buscarEmpleado(empleado1.getRut()) == false) {
            empresa.ingresarEmpleado(empleado1);
            System.out.println("El empleado " + empleado1.getNombreEmpleado() + " fue agregado");
            
        }else{
            System.out.println("El empleado ya existe");
        }
        
        
        
        if (empresa.buscarEmpleado(empleado2.getRut()) == false) {
            empresa.ingresarEmpleado(empleado2);
            System.out.println("Empleado " + empleado2.getNombreEmpleado() + " fue ingresado");
            
        } else {
            System.out.println("El empleado ya existe");
        }
        
        
        empresa.listaEmpleados();
        empresa.eliminarEmpleado(empleado1.getRut());
        empresa.listaEmpleados();
        
        
       
        
        
    }
    
}
