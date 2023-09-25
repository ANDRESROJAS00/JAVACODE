package EjercicioEvento;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Evento {
    private static int contadorEventos = 1;
    
    private int codigoEvento, cantPersonas;
    private String ubiEvento, tipoEvento, fechaEvento, horaInicio, horaFin;
    private double precio;
    private boolean servEntretencion;

    public Evento() {
    }

    public Evento(int codigoEvento, int cantPersonas, String fechaEvento, String horaInicio, String horaFin, String ubiEvento, String tipoEvento, double precio, boolean servEntretencion) {
        this.codigoEvento = contadorEventos++;
        this.cantPersonas = cantPersonas;
        this.fechaEvento = fechaEvento;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.ubiEvento = ubiEvento;
        this.tipoEvento = tipoEvento;
        this.precio = precio;
        this.servEntretencion = servEntretencion;
    }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getUbiEvento() {
        return ubiEvento;
    }

    public void setUbiEvento(String ubiEvento) {
        this.ubiEvento = ubiEvento;
    }

    public String getTipoEvento() {
        return tipoEvento.toLowerCase();
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isServEntretencion() {
        return servEntretencion;
    }

    public void setServEntretencion(boolean servEntretencion) {
        this.servEntretencion = servEntretencion;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigoEvento=" + codigoEvento + ", cantPersonas=" + cantPersonas + ", fechaEvento=" + fechaEvento + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", ubiEvento=" + ubiEvento + ", tipoEvento=" + tipoEvento + ", precio=" + precio + ", servEntretencion=" + servEntretencion + '}';
    }

}
