package registrodevehivulos;

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        Taller taller = new Taller();
        Categoria ca = new Categoria("city car", 1);
        Categoria ca2 = new Categoria("Todo terreno", 2);
        City city = new City(12, "AAAA2222", "Maruti", ca);
        TodoTerreno td = new TodoTerreno("AAA", 30, "BBBB222", "Tucson", ca2);
        TodoTerreno td2 = new TodoTerreno("ABC", 40, "CCCC333", "V16", ca2);
        
        
        taller.agregar(city);
        taller.agregar(city);
        taller.agregar(td2);
        taller.agregar(td);
        System.out.println("Imprimieno los vehiculos.---------\n");
        taller.imprimir();
        System.out.println(".--.-.-.-.- actualizando un modelo .-.-.-.-.-.-");
        taller.actualizar("BBBB22", "Santa Fe");
        taller.imprimir();
        System.out.println("\n.-.-.-.-.-.-.- Eliminando Vehiculo .-.-.-.-.-.-.-");
        //taller.eliminar("BBBB22");
        //taller.imprimir();
        System.out.println(".-.-.-.-.-.-.-.-.- Imprimiendo vehiculo .-.-.-.-.-.-.-");
        taller.imprimirBuscar("BBBB22");
        System.out.println("");
        System.out.println(".-.-.-.-.- Imprimiendo todos los todo terreno");
        taller.imprimirTodoTerreno();
        System.out.println(".-.-.-.-.-.-.-.- imprimiendo todos los citycar");
        taller.imprimirCity();
        
        
        
    }

}
