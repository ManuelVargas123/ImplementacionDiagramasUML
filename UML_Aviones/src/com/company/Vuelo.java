package com.company;

import java.util.Vector;

public class Vuelo
{
    private Piloto piloto;
    private Vector vueloVector;
    private Compania compania;
    private Vector vectorReserva;
    public Vuelo()
    {
        System.out.println("Se creo un vuelo");
        Piloto pilotos[] = new Piloto [2];
        Vector<Vuelo> vueloVector = new Vector();
        Vector<Reserva> vectorReserva = new Vector();
    }
}
