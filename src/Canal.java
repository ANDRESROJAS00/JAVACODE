/**
 *
 * @author andre
 */
public class Canal {
    private String nombreCanal, descripcion;
    private int suscriptores, cantVideos, ganancias;

    public Canal() {
    }

    public Canal(String nombreCanal, String descripcion, int suscriptores, int cantVideos, int ganancias) {
        this.nombreCanal = nombreCanal;
        this.descripcion = descripcion;
        this.suscriptores = suscriptores;
        this.cantVideos = cantVideos;
        this.ganancias = ganancias;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    public int getCantVideos() {
        return cantVideos;
    }

    public void setCantVideos(int cantVideos) {
        this.cantVideos = cantVideos;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    @Override
    public String toString() {
        return "Canal{" + "nombreCanal=" + nombreCanal + ", descripcion=" + descripcion + ", suscriptores=" + suscriptores + ", cantVideos=" + cantVideos + ", ganancias=" + ganancias + '}';
    }
    
    
    
    public void verDatos(){
        System.out.println("*****Datos del canal*****");
        System.out.println("Nombre del canal: " + this.getNombreCanal());
        System.out.println("Descripcion del canal: " + this.getDescripcion());
        System.out.println("Suscriptores del canal: " + this.getSuscriptores());
        System.out.println("Cantidad de videos del canal: " + this.getCantVideos());
        System.out.println("Ganancias generadas en el canal: " + this.getGanancias());
    }
    
    
    public void actualizarGanancias(){
        if (suscriptores >= 500) {
            int incremento = (suscriptores /500)*100;
            ganancias = incremento;
        } 
    }
    
    public void aumentarSuscriptores(int cantidad){
        this.suscriptores += cantidad;
    }
    
    
    
}
