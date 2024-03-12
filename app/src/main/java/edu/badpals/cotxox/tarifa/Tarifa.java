package edu.badpals.cotxox.tarifa;
import edu.badpals.cotxox.carrera.*;

public class Tarifa {

    static final double COSTE_MILLA = 1.35 ;
    static final double COSTE_MINUTO = 0.35;
    static final double COSTE_MINIMO = 5 ;
    static final byte PORCENTAJE_COMISION = 20 ;

    public Tarifa() {

    }

    public static double getCosteDistancia(Double distancia){
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int tiempo){
        return tiempo * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera){

        double distancia = carrera.getDistancia();
        double tiempo = carrera.getTiempoCarrera();

        double costeTotal = getCosteDistancia(distancia) + getCosteTiempo((int) tiempo);
        if (costeTotal < COSTE_MINIMO) {
            return COSTE_MINIMO; } else {
            return costeTotal;
        }
    }
}
