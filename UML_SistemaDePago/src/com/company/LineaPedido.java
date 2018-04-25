package com.company;

import java.util.Vector;

public class LineaPedido
{
    private Pedido pedido;
    private Vector<Producto> productoVector = new Vector();
    public LineaPedido()
    {
        System.out.println("Se ha creado una Linea de Pedido");
    }
}
