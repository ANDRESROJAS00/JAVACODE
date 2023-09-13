
package listaempleados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Empresa {
    
    //ArrayList es una clase proporcionada por java
    //Dentro de la clase array contendra objetos de la clase Empleado
    //listaEmpleados es el nombre de la variable
    private ArrayList<Empleado> listaEmpleados;   

    
    
    public Empresa(){
        listaEmpleados = new ArrayList<>();
    }
    
    
    
    
    //Ingresar Empleado
    public boolean ingresarEmpleado(Empleado emp){
        return listaEmpleados.add(emp);
    }
    
    
    //Eliminar empleado
    public void eliminarEmpleado(String rut){
        for (Empleado empleado : listaEmpleados) {
            if (this.buscarEmpleado(rut)) {
                listaEmpleados.remove(empleado);
                System.out.println("Empleado eliminado");
            } else {
                System.out.println("Empleado no existe");
            }
        }
        
    }
    


    //buscar
    public boolean buscarEmpleado(String rut)
    {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getRut().equals(rut)) {
                return true;
            }
        }
        return false;
    }
    

    
    //listar
    public void listaEmpleados()
    {
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
            
        }
    }
    
    
    

    

    
    
    
    
}
