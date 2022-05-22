package de.hhn.prog2.lab07;

import java.util.ArrayList;
import java.util.Collection;

interface Animal {
    void eat();
}

class Tiger implements Animal {
    public void eat() {
        System.out.println("crunch crunch, roaaaar!");
    }
}

class Pig implements Animal {
    public void eat() {
        System.out.println("munch munch, oink!");
    }
}

public class AnimalZoo {
    public static void main(String[] args) {
        ArrayList<Tiger> tigers = new ArrayList<>();
        tigers.add(new Tiger());

        ArrayList<Pig> pigs = new ArrayList<>();
        pigs.add(new Pig());

        feed(tigers);


         feed(pigs);
    }

    /**
     * Calls method eat() for every object
     * as long as it implements Animal interface.
     *
     * @param animals Generic collection which implements Animal class
     */
    public static void feed(Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
