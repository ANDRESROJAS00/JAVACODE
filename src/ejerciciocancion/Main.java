
package ejerciciocancion;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        
    Scanner scanner = new Scanner(System.in);
    int opcion;
    
    
    PlayList lista1 = new PlayList();
    lista1.almacenarCancion(new Canciones("quedate", "raggeton ", "quevedo", 's'));
    lista1.almacenarCancion(new Canciones("rompe", "raggeton", "daddy yankee", 'n'));
    lista1.almacenarCancion(new Canciones("guaton loyola", "cueca", "hermanos campos", 's'));
    
    PlayList lista2 = new PlayList();
    lista2.almacenarCancion(new Canciones("baki", "anime", "ogro", 's'));
    lista2.almacenarCancion(new Canciones("1234", "numerico", "java", 'n'));
    lista2.almacenarCancion(new Canciones("numb", "rock", "linkpark", 's'));
    
    
        do {
            
            System.out.println("****Lista de canciones****");
            System.out.println("1. Mostrar lista 1");
            System.out.println("2. Mostrar lista 2");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    lista1.mostrarCancion();
                    break;
                case 2:
                    lista2.mostrarCancion();
                    break;
                case 3:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
            
            
            
        } while (opcion != 3);
    
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
