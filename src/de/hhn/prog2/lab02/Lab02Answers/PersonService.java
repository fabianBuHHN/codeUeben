package de.hhn.prog2.lab02.Lab02Answers;

import java.util.HashSet;

public class PersonService {

    private Person person;

    public PersonService() {
    }

    public void createPerson(int age, String prename, String lastname, HashSet<HOBBY> hobby) {
        person = new Person(age, prename, lastname, hobby);
    }


    public void printPerson() {
        System.out.println("Alter: " + person.getAge() + "\n" + "Vorname: " + person.getPrename() + "\n" + "Nachname: " + person.getLastname());
        System.out.print("Hobby: ");
        for(HOBBY hobby : person.getHashSetHobby()){
            System.out.println(hobby.toString());
        }
    }
}