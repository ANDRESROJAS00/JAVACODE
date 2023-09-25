package EjercicioEvento;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author andre
 */
public class ListaEvento {
    
    private ArrayList<Evento> listaEvento = new ArrayList<>();

    public ListaEvento() {
    }
    
   
    
    //Metodo para agregar un evento a la lista
    public void agregarEvento(Evento evento){
        listaEvento.add(evento);
    }
    
    
    
    
    //Metodo para ordenar por fecha
    public void listarEventosPorFecha(){
        //Ordenar los eventos por fechas
        Collections.sort(listaEvento, (e1, e2) -> e1.getFechaEvento().compareTo(e2.getFechaEvento()));
        
        //Imprimir los eventos
        for (Evento evento : listaEvento) {
            System.out.println(evento.toString());
            
        }
    }
    
    
    //Metodo para deternibar ek total de ventas por tipo de evento
    public void totalPorEvento(){
        //Inicializar los cantadores por tipo de evento
        int totalCumpleaños = 0;
        int totalMatrimonio = 0;
        int totalCena = 0;
        int totalFiestas = 0;
        //Calcular ventas por tipo de evento
        for (Evento evento : listaEvento) {
            switch(evento.getTipoEvento()){
                case "cumpleaños":
                    totalCumpleaños += evento.getPrecio();
                    break;
                case "matrimonio":
                    totalMatrimonio += evento.getPrecio();
                    break;
                case "cena":
                    totalCena += evento.getPrecio();
                    break;
                case "fiesta":
                    totalFiestas += evento.getPrecio();
                    break;       
            }  
        }
        //Imprimir el monto de los eventos
        System.out.println("Total de ventas por tipo de evento");
        System.out.println("Total de ventas de Cumpleaños: " + totalCumpleaños);
        System.out.println("Total de ventas de Matrimonio: " + totalMatrimonio);
        System.out.println("Total de ventas de Cena: " + totalCena);
        System.out.println("Total de ventas de Fietas: " + totalFiestas);
    }
    
    
    //Determinar el tipo de eventos mas solicitados
    
    public void tipoDeEventoMasSolicitado(){
        //Inicializar contadores
        int cumpleaños = 0;
        int matrimonio = 0;
        int cena = 0;
        int fiesta = 0;
        
        //Contar eventos por tipo
        for (Evento evento : listaEvento) {
            switch(evento.getTipoEvento()){
                case "Matrimonio":
                    matrimonio++;
                    break;
                case "Cena":
                    cena++;
                    break;
                case "Fiesta":
                    fiesta++;
                    break;
                case "Cumpleaños":
                    cumpleaños++;
                    break;                        
            }
        }
        //Determinar el tipo de evento mas solicitudo
        String tipoMasSolicitado= "";
        int maxSolicitudes = 0;
    
        if (cumpleaños > maxSolicitudes) {
            tipoMasSolicitado = "cumpleaños";
            maxSolicitudes = cumpleaños;
        }
        if (matrimonio > maxSolicitudes){
            tipoMasSolicitado = "";
            maxSolicitudes = matrimonio;
        }
        if (cena > maxSolicitudes){
            tipoMasSolicitado = "";
            maxSolicitudes = cena;
        }
        if (fiesta > maxSolicitudes){
            tipoMasSolicitado = "";
            maxSolicitudes = fiesta;
        }
        
        System.out.println("El tipo de evento mas solicitado es: " + tipoMasSolicitado);
    
    
    
    
   
    
    
    
    
    
}
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
 
    
}
