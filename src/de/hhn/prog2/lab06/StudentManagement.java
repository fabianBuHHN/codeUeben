package de.hhn.prog2.lab06;

import java.io.IOException;
import java.util.HashMap;

/**
 * Makes student object useable within a HashMap.
 * One can add entries, remove entries and view the list.
 */
public class StudentManagement {

    private HashMap<Integer, Student> studentHashMap;
    private Student student;

    public StudentManagement(){
        studentHashMap = new HashMap<>();
    }

    /**
     * matriculate initiates a new student object in order to save it
     * in the HashMap studentHashMap.
     * As long as there is no such student.
     *
     * @param name name of the student
     * @param prename prename of the student
     * @param matriculationNumber matriculation number of the student
     */
    public void matriculate(String name, String prename, int matriculationNumber) throws IOException {
        if(!studentHashMap.containsKey(matriculationNumber)){
            student = new Student(name, prename, matriculationNumber);
            studentHashMap.put(matriculationNumber, student);
        } else System.out.println("Ein Student mit dieser Matrikelnummer ist bereits im System gespeichert");
    }

    /**
     * exmatriculate removes a student from the studentHashMap.
     * If such entry is found based on matricualtionNumber.
     *
     * @param matriculationNumber the
     */
    public void exmatriculate(int matriculationNumber) {
        if(!studentHashMap.containsKey(matriculationNumber)){
            System.out.println("Kein passender Eintrag gefunden!");
        } else {
            studentHashMap.remove(matriculationNumber);
        }
    }

    /**
     * Displays a list of every student in studentHashMap.
     * If theres such a list.
     */
    public void printList() {
        if(!studentHashMap.isEmpty())
        for(Student st : studentHashMap.values()){
            System.out.print(st.toString());
            System.out.println();
        } else {
            System.out.println("Liste ist leer");
        }
    }
}
