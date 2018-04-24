package com.company;

import java.util.Vector;

public class Person
{
    private ContactInformation contactInfo;
    private Vector<Departament> vectorDepartament = new Vector<Departament>();
    private String name;
    private int employeedID;
    private String title;

    public Person(String name, int employeedID, String title)
    {
        System.out.println("A person has been created");
        this.name = name;
        this.employeedID = employeedID;
        this.title = title;
        this.contactInfo = contactInfo;
    }

    public void setContactInfo(ContactInformation contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setDepartament(Departament departament) {
        vectorDepartament.add(departament);
    }
}
