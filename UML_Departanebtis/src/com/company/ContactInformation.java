package com.company;

public class ContactInformation
{
    private String addres;
    private Person person;
    public ContactInformation(String addres)
    {
        this.addres = addres;
        System.out.println("A Contact Information has been cretaed");
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
