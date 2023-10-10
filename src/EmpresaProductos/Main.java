
package EmpresaProductos;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        
        
        Empleado empleado1 = new Empleado("Andres", "Rojas Maturana", "19643310-4", "Jose miguel carrera", 5, 990872531, 900000);
        Empleado empleado2 = new Empleado("David", "Rojas Maturana", "17425645-3", "Santiago", 6, 956562326, 1000000);
        
  
        empleado1.cambiarSupervisor(empleado2);
        empleado1.incremenrarSalario();
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-  DATOS DE EMPLEADO 1 -.-.-.-.-.-.-.-.-.-.-.-.- ");
        empleado1.imprimir();
        
        
        Secretario secretario1 = new Secretario("Santiago", "123456", "Joe Biden", "Perez Rodriguez", "123456789", "La pintana", 20, 10, 30);
        Coche coche1 = new Coche("XCVB123", "LAMBO", "5");
        JefedeZona jefe1 = new JefedeZona(secretario1, coche1, "dolaron", "salario inversion", "99999999-9", "Las Vegas", 40, 99999999, 99999999);
        
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.- DATOS DE JEFE DE ZONA 1 -.-.-.-.-.-.-.-.-.-.-.-.- ");
        jefe1.imprimir();
        jefe1.incrementarSalario();
        
        
        
        
       
        
    }
    
}
