
package EjercicioEvento;

/**
 *
 * @author andre
 */
public class ValidarEvento {
    
    
    public boolean validarTipoEvento(String tipoEvento){
        if (tipoEvento.equalsIgnoreCase("cumpleaños") || tipoEvento.equalsIgnoreCase("matrimonio") || tipoEvento.equalsIgnoreCase("cena") || tipoEvento.equalsIgnoreCase("fiesta")) {
            System.out.println("Tipo de evento correcto");
            return true;
        } else {
            System.out.println("Tipo de evento no permitido");
            return false;
        }
    }
    
}
