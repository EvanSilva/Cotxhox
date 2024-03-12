package edu.badpals.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {

    List<Conductor> conductores = null;

    public PoolConductores(List<Conductor> conductores){
        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores (){
        return this.conductores;
    }

    public Conductor asignarConductor (){

        for (Conductor conductor :conductores){
            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                return conductor;
            } else {continue;}
        }
    }

}
