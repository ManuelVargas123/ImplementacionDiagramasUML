package com.company;

public class Main {

    public static void main(String[] args)
    {
        Company company = new Company();
        Departament departament1 = new Departament("Sales");
        Departament departament2 = new Departament("US Sales");
        Departament departament3 = new Departament("R&D");
        Person person = new Person("Erin", 4362,"VIP of Sales" );
        ContactInformation contactInformation = new ContactInformation("1472 Miller St.");

        company.setDepartament(departament1);
        company.setDepartament(departament2);
        company.setDepartament(departament3);

        person.setDepartament(departament1);
        person.setDepartament(departament2);
        person.setDepartament(departament3);
        person.setContactInfo(contactInformation);

        departament1.setCompany(company);
        departament2.setCompany(company);
        departament3.setCompany(company);

        departament1.setPerson(person);
        departament2.setPerson(person);
        departament3.setPerson(person);

        contactInformation.setPerson(person);
    }
}
