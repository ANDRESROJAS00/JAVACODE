package EjercicioRedSocial;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Twitter extends RedSocial {
    
    private static int contadorTwitter = 1;
    private int id;
    private String noticia;
    private Date fecha;

    public Twitter() {
    }

    public Twitter(int id, String noticia, Date fecha, String usuario, String password) {
        super(usuario, password);
        this.id = contadorTwitter++;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Twitter{" + "id=" + id + ", noticia=" + noticia + ", fecha=" + fecha + '}' + super.toString();
    }
    
    
    
    public boolean listarTwitter(){
        System.out.println("Id Twitter = " + this.getId());
        if (super.usuario.equalsIgnoreCase("adminTwitter") && super.password.equalsIgnoreCase("1234456")) {
            System.out.println("Listar Twitter = " + toString());
            return true;
            
        } else {
            System.out.println("\nUsuario y password no permitidos");
            return false;
        }
        
    }
    
    
    
   
    @Override
    public String visualizar(){
        return this.getNoticia();
    }
    
  
    @Override
    public void limpiar(){
        System.out.println("Limpiar Twitter");
    }

}
