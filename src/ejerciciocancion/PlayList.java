
package ejerciciocancion;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class PlayList {
    
    
    private  ArrayList<Canciones> listaCanciones;
    
    
    
    
    public PlayList(){
        listaCanciones = new ArrayList<>();
        
    }
    
    
    public boolean almacenarCancion(Canciones canciones){
        return listaCanciones.add(canciones);
    }
    
    
    
    
    public void mostrarCancion(){
        for (Canciones listaCancione : listaCanciones) {
            System.out.println(listaCancione);
        }
    }
    
}
