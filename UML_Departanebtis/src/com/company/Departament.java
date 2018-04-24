package com.company;

public class Departament
{
    private Person person;
    private Company company;
    private String name;
    public Departament(String name)
    {
        this.name = name;
        System.out.println("A departament has been created");
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPerson(Person person){
        this.person = person;
    }
}
