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

        Conductor conductor = null

        for (Conductor posibleConductor :conductores){

            if (!posibleConductor.isOcupado()) {
                posibleConductor.setOcupado(true);
                return posibleConductor;
                break;
            } else {continue;}
        }
        return conductor;
    }
}
