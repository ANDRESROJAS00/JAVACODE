
package listaempleados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Empresa {
    
    
  private ArrayList<Empleado>listaEmpleado;
  
  
  
  
  public Empresa(){
      listaEmpleado = new ArrayList<>();
  }
  
  
  //agregar empleado
  
  public boolean agregarEmpleado(Empleado emp){
      return listaEmpleado.add(emp);
  }
  
  
  
  //Encontrar empleado
  public boolean encontrarEmpleado(String rut){
      for (Empleado empleado : listaEmpleado) {
          if (empleado.getRut().equals(rut)) {
              return true;
          }
          
      }
      return false;
  }
  
  
  //Eliminar empleado
  public void eliminarEmpleado(String rut){
      for (Empleado empleado : listaEmpleado) {
          if (this.encontrarEmpleado(rut)) {
              listaEmpleado.remove(empleado);
              System.out.println("Empleado eliminado");
              
          }else{
              System.out.println("El empleado no existe");
          }
      }
      
  }
  
  //Listar empleado
  public void listarEmpleado(){
      for (Empleado empleado : listaEmpleado) {
          System.out.println(empleado);
      }
  }
  
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
