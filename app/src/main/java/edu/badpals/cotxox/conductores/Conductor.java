package edu.badpals.cotxox.conductores;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;

public class Conductor {

    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private Double valoracionMedia = 0.0;
    private boolean ocupado = false;
    private List<Byte> valoraciones = new ArrayList<>();

    public Conductor() {
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Byte> getValoracion() {
        return this.valoraciones;
    }

    public Double getValoracionMedia() {
        return this.valoracionMedia;
    }

    public int getNumeroValoraciones() {
        return valoraciones.size();
    }


    public void setValoracion(byte valoracion){

        valoraciones.add(valoracion);
        double mediaValoraciones = calculaValoracionMedia();
        this.valoracionMedia = mediaValoraciones;
    }

    private double calculaValoracionMedia(){

        double sumaValoraciones = 0.0;

        for (Byte estaValoracion: valoraciones){
            sumaValoraciones = estaValoracion + sumaValoraciones;
        }

        double mediaValoraciones = sumaValoraciones / getNumeroValoraciones();
        return mediaValoraciones;

    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }
}
