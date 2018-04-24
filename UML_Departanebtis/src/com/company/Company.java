package com.company;

import java.util.Vector;

public class Company
{
    private Vector<Departament> vectorDepartament = new Vector<Departament>();
    public Company()
    {
        System.out.println("A company has been created");

    }

    public void setDepartament(Departament departament) {
       vectorDepartament.add(departament);
    }
}
