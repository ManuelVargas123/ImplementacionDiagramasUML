package com.company;

import java.util.Vector;

public class Vendedor
{
    private Vector<ClienteCorporativo> clienteCorporativoVector = new Vector();
    private Vendedor vendedor;
    public Vendedor()
    {
        System.out.println("Se ha creado un Vendedor");
    }

    public void setVendedor(Vendedor vendedor)
    {
        this.vendedor = vendedor;
    }

    public int consultaDesdeVendedor(SistemaPago sistemaPago)
    {
        return sistemaPago.consultarSaldo();
    }
}
