
package ejerciciocancion;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Canciones {
    
    private String nombreCancion, generoCancion, artistaCancion;
    private char favorito;

    public Canciones(String nombreCancion, String generoCancion, String artistaCancion, char favorito) {
        this.nombreCancion = nombreCancion;
        this.generoCancion = generoCancion;
        this.artistaCancion = artistaCancion;
        this.favorito = favorito;
    }

    public Canciones() {
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getGeneroCancion() {
        return generoCancion;
    }

    public void setGeneroCancion(String generoCancion) {
        this.generoCancion = generoCancion;
    }

    public String getArtistaCancion() {
        return artistaCancion;
    }

    public void setArtistaCancion(String artistaCancion) {
        this.artistaCancion = artistaCancion;
    }

    public char getFavorito() {
        return favorito;
    }

    public void setFavorito(char favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "Canciones{" + "nombreCancion=" + nombreCancion + ", generoCancion=" + generoCancion + ", artistaCancion=" + artistaCancion + ", favorito=" + favorito + '}';
    }
    
    
    
    
    
    
    
}
