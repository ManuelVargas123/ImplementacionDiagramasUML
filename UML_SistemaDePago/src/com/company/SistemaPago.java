package com.company;

public class SistemaPago
{
    private int Saldo;
    public SistemaPago()
    {
        System.out.println("Se ha creado un Sistema de Pago");
        Saldo = 0;
    }

    public int consultarSaldo()
    {
        System.out.println("El saldo se ha consultado");
        return Saldo;
    }
}
