package edu.badpals.cotxox;

import edu.badpals.cotxox.carrera.Carrera;
import edu.badpals.cotxox.tarifa.Tarifa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTarifa {

    @Test
    public void testDistancia(){
        double distancia = 10.70;
        assertEquals(14.445, Tarifa.getCosteDistancia(distancia),0.01);
    }

    @Test
    public void testTiempo(){
        int tiempoEsperadoMinutos = 30;
        assertEquals(10.5,Tarifa.getCosteTiempo(tiempoEsperadoMinutos),0.01);
    }
    @Test
    public void testMinimo(){
        Carrera carrera = new Carrera("4916119711304546");
        carrera.setDistancia(3.0);
        carrera.setTiempoCarrera(1);
        assertEquals(5.0d,carrera.getCosteEsperado(),0.01);
    }
    @Test
    public void testCosteTotal(){
        Carrera carrera = new Carrera("4916119711304546");
        carrera.setDistancia(7.75);
        carrera.setTiempoEsperado(10);
        assertEquals(13.96,carrera.getCosteEsperado(),0.01);
    }
}
