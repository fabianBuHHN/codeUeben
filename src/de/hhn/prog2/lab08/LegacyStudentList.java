package de.hhn.prog2.lab08;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * LegacyStudentList instantiates an array to add Student objects to it and provides an Iterator.
 */
public class LegacyStudentList {

    private Student[] studentsArr;
    private int counter = 0;
    int currentIndex = 0;

    public Student[] getStudentsArr() {
        return studentsArr;
    }

    public LegacyStudentList(int size) {
        studentsArr = new Student[size];
    }

    /**
     * Adds Student object to a Student array.
     * An exception is thrown if the array is to small.
     *
     * @param student Student object to be added
     */
    public void addStudent(Student student) {
        if (counter < studentsArr.length) {
            studentsArr[counter] = student;
            counter++;
        } else throw new IndexOutOfBoundsException("array too small");
    }

    /**
     * Overrides iterator from standard library to be used in this case, with an array.
     *
     * @return The overwritten iterator
     */
    public Iterator<Student> getIterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return currentIndex < studentsArr.length;
            }

            @Override
            public Student next() {
                if (!hasNext()) throw new NoSuchElementException();
                return studentsArr[currentIndex++];
            }
        };
    }
}
