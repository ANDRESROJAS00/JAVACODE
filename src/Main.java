
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        Canal canal = new Canal();
        Cuenta cuenta = new Cuenta();
        

        do {
            System.out.println("********Menu de youtube********");
            System.out.println("1. Ingresar datos para el canal");
            System.out.println("2. Ver datos del canal");
            System.out.println("3. Aumentar suscriptores");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("****Ingresando datos de canal de youtube****");
                    System.out.println("Ingresa el usuario para el canal: ");
                    String user = scanner.next();
                    scanner.nextLine();
                    cuenta.setUser(user);
           
                    System.out.println("Ingresa la password del canal: ");
                    String password = scanner.next();
                    scanner.nextLine();
                    cuenta.setPassword(password);
                    
                    System.out.println("Ingresa el mail del canal: ");
                    String mail = scanner.next();
                    scanner.nextLine();
                    cuenta.setMail(mail);

                    System.out.println("Ingresar nombre del canal;");
                    String nombreCanal = scanner.next();
                    scanner.nextLine();
                    canal.setNombreCanal(nombreCanal);

                    System.out.println("Ingresar descripcion del canal:");
                    String descripcion = scanner.nextLine();
                    canal.setDescripcion(descripcion);

                    System.out.println("Ingresar cantidad de suscriptores:");
                    int suscriptores = scanner.nextInt();
                    scanner.nextLine();
                    canal.setSuscriptores(suscriptores);

                    System.out.println("Ingresar cantidad de videos subidos: ");
                    int cantVideos = scanner.nextInt();
                    scanner.nextLine();
                    canal.setCantVideos(cantVideos);
                    canal.actualizarGanancias();
                    break;
                case 2:
                    System.out.println("Ingrese el usuario: ");
                    String inputUsuario = scanner.next();
                    scanner.nextLine();
                    
                    
                    System.out.println("Ingrese el password: ");
                    String inputPassword = scanner.next();
                    scanner.nextLine();
                    
                    if (cuenta.validarUsuario(inputUsuario, inputPassword)) {
                        System.out.println("Usuario encontrado\n");
                        canal.verDatos();
                        
                    } else {
                        System.out.println("Ingrese un usuario y contraseña correctos");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de suscriptores que desea agregar: ");
                    int cantidadSuscriptores = scanner.nextInt();
                    scanner.nextLine();
                    canal.aumentarSuscriptores(cantidadSuscriptores);
                    canal.actualizarGanancias();
                    break;
                    
                    
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, elige una opcion valida ");
            }

        } while (opcion != 4);
    }

   
}
