package com.company;

import java.util.Vector;

public class Pedido
{
    private Cliente cliente;
    //private Vector<LineaPedido> lineaPedidoVector = new Vector();
    public Pedido()
    {
        System.out.println("Se ha creado un pedido");
        Vector<LineaPedido> lineaPedidoVector = new Vector();
    }
}
