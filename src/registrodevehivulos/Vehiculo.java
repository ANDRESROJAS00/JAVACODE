package registrodevehivulos;

/**
 *
 * @author andre
 */
public abstract class Vehiculo {

    private String patente, modelo;
    private Categoria categoria;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String modelo, Categoria categoria) {
        this.patente = patente;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", categoria=" + categoria + '}';
    }

    public void imprimir() {
        if (patente.length() >= 6) {
            System.out.println("patente = " + patente);
            System.out.println("modelo = " + modelo);
            categoria.imprimir();
            
        } else {
            System.out.println("La patente debe ser mayor a 6 caracteres.");
        }
        
        

    }

}
