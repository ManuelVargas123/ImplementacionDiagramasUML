package com.company;

import java.util.Vector;

public class Producto
{
    private Vector<LineaPedido> lineaPedidoVector;
    public Producto()
    {
        System.out.println("Se ha creado un producto");
        lineaPedidoVector = new Vector();
    }

    public void setLineaPedidor(LineaPedido lineaPedido) {
        lineaPedidoVector.add(lineaPedido);
    }
}
