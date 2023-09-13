
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Cuenta {
    private String user, password, mail;
    

    public Cuenta() {
    }

    public Cuenta(String user, String password, String mail) {
        this.user = user;
        this.password = password;
        this.mail = mail;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        Scanner scanner = new Scanner(System.in);

        do {
            if (user.length() >= 3 && user.length() <= 20) {
                this.user = user;
                break;
            } else {
                System.out.println("Debes ingresar un usuario con entre 3 y 20 caracteres.");
                System.out.println("Ingresa el usuario para el canal: ");
                user = scanner.next();
                scanner.nextLine();
            }
        } while (true);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Scanner scanner = new Scanner(System.in);
        do {
            if (password.length() >= 3 && password.length() <= 20) {
            this.password = password;
            break;
        } else {
            System.out.println("Debes ingresar una contraseña de 3 a 20 caracteres");
            System.out.println("Ingrese la contraseña del canal");
            password = scanner.next();
            scanner.nextLine();
        }
            
        } while (true);
        
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        Scanner scanner = new Scanner(System.in);
        do {
            if (mail.contains("@")) {
            this.mail = mail;
            break;
        } else {
            System.out.println("El correo debe tener almenos un @");
                System.out.println("Ingrese el mail del canal: ");
                mail = scanner.next();
                scanner.nextLine();
        }
            
        } while (true);
                
    }

    
    public boolean validarUsuario(String usuario,String password){
        return this.user.equals(usuario) && this.password.equals(password);
            }
    
    
    
       @Override
    public String toString() {
        return "Cuenta{" + "user=" + user + ", password=" + password + ", mail=" + mail + '}';
    }
    
    
    
    

   
    
    
}
