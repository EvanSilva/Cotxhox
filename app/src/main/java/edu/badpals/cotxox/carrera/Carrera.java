package edu.badpals.cotxox.carrera;
import edu.badpals.cotxox.conductores.Conductor;
import edu.badpals.cotxox.tarifa.Tarifa;

public class Carrera {

    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private Double distancia = 0.0;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private Double costeTotal = 0.0;
    private int propina = 0;
    private Conductor conductor = null;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return this.distancia;
    }

    // TODO TODO TODO TODO TODO TODO TODO TODO
    public Double getCosteEsperado() {
        return 0.0;
    }

    public int getTiempoEsperado() {
        return this. tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }
}
