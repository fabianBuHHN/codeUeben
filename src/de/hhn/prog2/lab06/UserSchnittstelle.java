package de.hhn.prog2.lab06;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * UserSchnittstelle makes it possible for a user to add a student,
 * remove a student from the list and view all entries.
 */
public class UserSchnittstelle {

    private Scanner scan;
    private StudentManagement studentManagement;

    public static void main(String[] args) {
        new UserSchnittstelle();
    }

    public UserSchnittstelle() {
        studentManagement = new StudentManagement();
        scan = new Scanner(System.in);
        readInput();
    }

    /**
     * Gives the user the possibility to use the program with the console.
     */
    private void readInput() {
        System.out.println("Was möchten Sie machen?");
        System.out.println("Tippen sie 'hilfe' für die Hilfe ein");
        while (scan.hasNext()) {
            switch (scan.nextLine().toLowerCase(Locale.ROOT)) {
                case "student aufnehmen":
                    System.out.println("Bitte geben Sie den Namen, den Vornamen und die Matrikelnummer ein - nach jeder Eingabe bitte die Eingabetaste drücken");
                    String name = scan.nextLine();
                    String prename = scan.nextLine();
                    int matriculationNumber = scan.nextInt();
                    try {
                        aufnehmen(name, prename, matriculationNumber);
                    } catch (IOException ioex) {
                        System.out.println("Bitte die Eingabe prüfen und wiederholen");
                        System.out.println();
                        readInput();
                        break;
                    }
                    System.out.println("Student aufgenommen");
                    break;
                case "student exmatrikulieren":
                    System.out.println("Bitte geben Sie die Matrikelnummer des Studenten ein");
                    int matNumber = scan.nextInt();
                    exmatrikulieren(matNumber);
                    System.out.println("Student " + matNumber + " exmatrikuliert");
                    break;
                case "alle studenten ausgeben":
                    listeAusgeben();
                    break;
                case "hilfe":
                    hilfe();
                    break;
            }
        }
    }

    /**
     * Adds a student entry to a list of students in class StudentManamgement.
     *
     * @param name                name of the student
     * @param prename             prename of the student
     * @param matriculationNumber matriculation numbber of the student
     */
    private void aufnehmen(String name, String prename, int matriculationNumber) throws IOException {
        studentManagement.matriculate(name, prename, matriculationNumber);
    }

    /**
     * Calls exmatriculate on studentManagement to delete a student entry from the list
     *
     * @param matNumber The matNumber of the student entry to be deleted from the list
     */
    private void exmatrikulieren(int matNumber) {
        studentManagement.exmatriculate(matNumber);
    }

    /**
     * Calls printList on studentManagement to display a list of every student.
     */
    private void listeAusgeben() {
        studentManagement.printList();
    }

    /**
     * Shows all usable commands to user.
     */
    private void hilfe() {
        System.out.println("Folgende Befehle stehen zur Verfügung");
        System.out.println("student aufnehmen - student exmatrikulieren - alle studenten ausgeben");
    }
}
