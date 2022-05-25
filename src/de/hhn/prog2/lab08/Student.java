package de.hhn.prog2.lab08;

/**
 * Student holds methods to get and set attributes for a Student object.
 */
public class Student {

    public Student(String prename, String lastname, String studentNumber) {
        setPrename(prename);
        setLastname(lastname);
        setStudentNumber(studentNumber);
    }

    private String prename, lastname, studentNumber;

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "prename='" + prename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }
}
