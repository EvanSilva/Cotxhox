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
    private List<Conductor> valoraciones = new ArrayList<>();

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

    public Double getValoracionMedia() {
        return this.valoracionMedia;
    }

    public int getNumeroValoraciones() {
        //todo todo todo todo todo todo todo
        return 0;
    }


    public void setValoracion(byte valoracion){
        //todo todo todo todo todo todo todo

    }

    private double calculaValoracionMedia(){
        //todo todo todo todo todo todo todo
        return 0.0;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }
}
