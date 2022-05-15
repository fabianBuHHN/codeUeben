package de.hhn.prog2.lab06;

import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Student holds students with name, prename and matriculationNumber.
 * Also checks if valid entries are handed over from StudentManagement.
 */
public class Student {

    private String name, prename;
    private int matriculationNumber;

    public Student(String name, String prename, int matriculationNumber) throws IOException {
        setName(name);
        setPrename(prename);
        setMatriculationNumber(matriculationNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IOException {
        if (name.length() >= 1) {
            this.name = name;
        } else throw new IOException("Enter name");
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) throws IOException {
        if (prename.length() >= 1) {
            this.prename = prename;
        } else throw new IOException("Enter prename");
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) throws IOException {
        if (String.valueOf(matriculationNumber).length() == 6) {
            this.matriculationNumber = matriculationNumber;
        } else throw new IOException("Wrong format");
    }

    @Override
    public String toString(){
        return "Vorname: " + getPrename() + " | Name: " + getName() + " | Matrikelnummer " + getMatriculationNumber();
    }
}
