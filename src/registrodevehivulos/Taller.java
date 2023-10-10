package registrodevehivulos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Taller {

    private List<Vehiculo> lista;

    public Taller() {
        lista = new ArrayList<Vehiculo>();
    }

    public boolean verificar(Vehiculo v) {
        for (Vehiculo ve : lista) {
            if (ve.getPatente().equalsIgnoreCase(v.getPatente())) {
                return true;
            }

        }
        return false;
    }

    public void agregar(Vehiculo v) {
        if (verificar(v) == false) {
            lista.add(v);
            System.out.println("Vehiculo agregado correctamente.");
        } else {
            System.out.println("El vehiculo ya se encuentra registrado en el sistema.");
        }
    }

    public void imprimir() {
        for (Vehiculo ve : lista) {
            ve.imprimir();

        }
    }

    public boolean actualizar(String patente, String nuevoModelo) {
        for (Vehiculo ve : lista) {
            if (ve.getPatente().equalsIgnoreCase(patente)) {
                ve.setModelo(nuevoModelo);
                System.out.println("El modelo se actualizo correctamente");
                return true;

            }

        }
        System.out.println("El vehiculo no esta registrado en el sistema.");
        return false;
    }

    public boolean eliminar(String patente) {
        for (Vehiculo ve : lista) {
            if (ve.getPatente().equalsIgnoreCase(patente)) {
                lista.remove(ve);
                System.out.println("Vehiculo eliminado correctamente");
                return true;

            }
        }
        System.out.println("El vehiculo no se encuentra en el sistema.");
        return false;
    }

    public boolean imprimirBuscar(String patente) {
        for (Vehiculo ve : lista) {
            if (ve.getPatente().equalsIgnoreCase(patente)) {
                ve.imprimir();
                return true;
            }

        }
        System.out.println("Vehiculo no registrado");
        return false;
    }

    public void imprimirTodoTerreno() {
        for (Vehiculo ve : lista) {
            if (ve instanceof TodoTerreno) {
                ve.imprimir();
                System.out.println(".-.-.-.-.-.-.-.-");

            }
        }
    }

    public void imprimirCity() {
        for (Vehiculo ve : lista) {
            if (ve instanceof City) {
                ve.imprimir();
                System.out.println(".-.-.-.-.-.-.-.-.-.-");

            }
        }
    }

}
