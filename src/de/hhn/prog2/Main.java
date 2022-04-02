package de.hhn.prog2;

import de.hhn.prog2.lab02.Lab02Answers.HOBBY;
import de.hhn.prog2.lab02.Lab02Answers.PersonService;

import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        PersonService personService = new PersonService();
        HashSet<HOBBY> hobbies = new HashSet<>();
        hobbies.add(HOBBY.LESEN);
        hobbies.add(HOBBY.FITNESS);

        try {

            personService.createPerson(23, "", "Butter", hobbies);
            personService.printPerson();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Please enter age, prename and lastname");
        }
        personService.createPerson(23, "Fabian", "Butter", hobbies);
        personService.printPerson();
    }
}
