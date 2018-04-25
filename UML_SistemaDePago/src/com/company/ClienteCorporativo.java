package com.company;

public class ClienteCorporativo extends Cliente
{
    private Contrato contrato;
    private Vendedor vendedor;
    public ClienteCorporativo()
    {
        System.out.println("Se ha creado un cliente corporativo");
    }
}
