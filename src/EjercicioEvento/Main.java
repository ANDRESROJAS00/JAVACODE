
package EjercicioEvento;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author andre
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        ListaEvento listaEvento = new ListaEvento();
        
        
        Evento evento1 = new Evento(0, 100, "2023-9-20", "1400", "1600", "Valparaiso", "matrimonio", 500000, true);
        
        Evento evento2 = new Evento(0, 200, "2022-9-20", "1300", "1500", "Santiago", "cEna", 400000, true);
        
        Evento evento3 = new Evento(0, 300, "2021-9-20", "1200", "1400", "Temuco", "fiesta", 300000, true);
        
        Evento evento4 = new Evento(0, 400, "2020-9-20", "1100", "1300", "La Serana", "cumpleaños", 200000, true);
        
        Evento evento5 = new Evento(0, 500, "2019-9-20", "1000", "1200", "Concepcion", "cumpleaños", 100000, true);
        
        Evento evento6 = new Evento(0, 600, "2018-9-20", "0900", "1100", "Valdivia", "cumpleaños", 200000, true);
        
        
        listaEvento.agregarEvento(evento1);
        listaEvento.agregarEvento(evento2);
        listaEvento.agregarEvento(evento3);
        listaEvento.agregarEvento(evento4);
        listaEvento.agregarEvento(evento5);
        listaEvento.agregarEvento(evento6);
        
        
        listaEvento.listarEventosPorFecha();
        listaEvento.tipoDeEventoMasSolicitado();
        listaEvento.totalPorEvento();
        
        
    }
    
}
