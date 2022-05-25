package de.hhn.prog2.lab08;

/**
 * StudentManagement creates 5 Student objects adds them to a collection from StudentList, iterates
 * over StudentList and prints all student objects.
 */
public class StudentManagement {

    public StudentManagement() {
        StudentList studentList = new StudentList();

        Student student0 = new Student("Fabi0", "Butter0", "0");
        Student student1 = new Student("Fabi1", "Butter1", "1");
        Student student2 = new Student("Fabi2", "Butter2", "2");
        Student student3 = new Student("Fabi3", "Butter3", "3");
        Student student4 = new Student("Fabi4", "Butter4", "4");

        studentList.addStudent(student0);
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.addStudent(student4);

        while(studentList.getIterator().hasNext()){
            Student student = studentList.getIterator().next();
            System.out.println(student.toString());
        }
    }

    public static void main(String[] args) {
        new StudentManagement();
    }
}
