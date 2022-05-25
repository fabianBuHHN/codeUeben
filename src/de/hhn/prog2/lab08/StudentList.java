package de.hhn.prog2.lab08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * StudentList instantiates an ArrayList and provides method to add Student objects and provides an iterator.
 */
public class StudentList {

    private ArrayList<Student> studentsArr;
    private int counter = 0;
    int currentIndex = 0;

    public ArrayList<Student> getStudentsArr() {
        return studentsArr;
    }

    public StudentList() {
        studentsArr = new ArrayList<>();
    }

    /**
     * Adds students to the Student objects array.
     *
     * @param student Student object to be added.
     */
    public void addStudent(Student student) {
        studentsArr.add(student);
    }

    /**
     * Overrides iterator from standard library to be used in this case, with an ArrayList.
     *
     * @return The overwritten iterator.
     */
    public Iterator<Student> getIterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return currentIndex < studentsArr.size();
            }

            @Override
            public Student next() {
                if(!hasNext()) throw new NoSuchElementException();
                return studentsArr.get(currentIndex++);
            }
        };
    }
}
