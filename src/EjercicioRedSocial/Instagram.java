package EjercicioRedSocial;

/**
 *
 * @author andre
 */
public class Instagram extends RedSocial {
    
    private int id;
    private String historia;
    private boolean estadp;

    public Instagram() {
    }

    public Instagram(int id, String historia, boolean estadp, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estadp = estadp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstadp() {
        return estadp;
    }

    public void setEstadp(boolean estadp) {
        this.estadp = estadp;
    }

    @Override
    public String toString() {
        return "Instagram{" + "id=" + id + ", historia=" + historia + ", estadp=" + estadp + '}' + super.toString();
    }
    
    
    
    
    
    public void listarInstagram()
    {
        String estadoStr = "";
        System.out.println("Id: " + this.getId());
        System.out.println("Historia: " + this.getHistoria());
        
        if (estadp) {
            estadoStr = "visible";
        }
        else{
            estadoStr = "no visible";
        }
        System.out.println("Estado: " + estadoStr);
        System.out.println("Usuario: " + super.getUsuario());
        //System.out.println("Password: " + super.getPassword());
        
    }
    
    
    
    
    
    
    
    
    
    @Override
    public String visualizar(){
        return super.visualizar() + " " + this.getHistoria();
    }
    
    
    @Override
    public void limpiar(){
        System.out.println("Limpiar Instagram");
    }

    

  
    
    
   
        
    
    
    
    
    
}
