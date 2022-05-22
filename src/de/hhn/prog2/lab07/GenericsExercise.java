package de.hhn.prog2.lab07;

public class GenericsExercise {


    /**
     * Uses methods from java standard library to display the datatype
     * which was handed over in parameter list
     */
    public <Out> void checkType(Out type) {
        System.out.format("%s is of type %s \r\n", type, type.getClass().getName());
    }

    public static void main(String[] args) {

        GenericsExercise g = new GenericsExercise();

        g.checkType("Hello");
        g.checkType(41);
        g.checkType("A");
        g.checkType(3.1337);

    }
}
