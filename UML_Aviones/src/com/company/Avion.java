package com.company;

import java.util.Vector;

public class Avion
{
    private Motor motorArray[];
    private Vector vectorVuelos;
    public Avion()
    {
        System.out.println("Se creo un avion");
        Motor motorArray[] = new Motor [4];
        Vector<Vuelo> vectorVuelos = new Vector();
    }
}
