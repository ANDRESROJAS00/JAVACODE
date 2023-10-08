package biblioteca;

import java.util.ArrayList;


/**
 *
 * @author andre
 */
public class listaLibros {

    ArrayList<Libro> listLibro;

    public listaLibros() {
        listLibro = new ArrayList<>();
    }

    public boolean agregarLibro(Libro libro) {
        System.out.println("Libro: " + libro + " Agregado.");
        return listLibro.add(libro);
    }

    public boolean encontrarLibro(String titulo, String autor) {
        for (Libro libro : listLibro) {
            if (libro.getTitulo().equals(titulo) && libro.getAutor().equals(autor)) {
                System.out.println("Libro encontrado, " + "Autor: " + libro.getAutor() + "Titulo: " + libro.getTitulo());
                return true;
            }
        }
        return false;

    }

    public boolean borrarLibro(String isbn) {
        for (Libro libro1 : listLibro) {
            if (libro1.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Libro: " + libro1 + " Eliminado.");
                listLibro.remove(libro1);
                return true;
            }
        }
        return false;
    }
    
    
    public void mostrarCatalogo(){
        for (Libro libro : listLibro) {
            System.out.println("libro = " + libro);
            
        }
    }
    

}
