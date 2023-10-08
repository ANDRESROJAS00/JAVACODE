
package biblioteca;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        
        listaLibros catalogo = new listaLibros();
        
        
        Libro libro1 = new Libro("HarryPotter", "Rowling", "123456", 20000);
        Libro libro2 = new Libro("Señor de los anillos", "tolkien", "1234567", 20000);
        
        
        catalogo.agregarLibro(libro1);
        catalogo.agregarLibro(libro2);
        //catalogo.encontrarLibro("HarryPotter", "Rowling");
        
        //catalogo.borrarLibro("123456");
        
        catalogo.mostrarCatalogo();
        
        
    }
    
}
