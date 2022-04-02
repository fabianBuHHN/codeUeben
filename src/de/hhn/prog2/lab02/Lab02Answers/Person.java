package de.hhn.prog2.lab02.Lab02Answers;

import java.util.HashSet;

public class Person {

    private String prename, lastname;
    private int age;
    private HashSet<HOBBY> hashSetHobby;

    public HashSet<HOBBY> getHashSetHobby() {
        return hashSetHobby;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrename() {
        return prename;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setHashSetHobby(HashSet<HOBBY> hashSetHobby) {
        if(hashSetHobby.size() < 5) {
            this.hashSetHobby = hashSetHobby;
        }else throw new NoFreeTimeException("One must not have more than 5 Hobbys");
    }



    public Person(int age, String prename, String lastname, HashSet<HOBBY> hobby) {

        hashSetHobby = new HashSet<>();

        if (age <= 0 || age >= 150) {
            throw new IllegalArgumentException("Please enter valid age");
        } else {
            setAge(age);
        }

        if (prename == null || prename.isEmpty()) {
            throw new IllegalArgumentException("Please enter valid prename");
        } else {
            setPrename(prename);
        }

        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Please enter valid lastname");
        } else {
            setLastname(lastname);
        }

        for(HOBBY h : hobby) {
            addHobby(h);
        }
    }

    public void addHobby(HOBBY hobby){
        if (hashSetHobby.size() <= 5) {
            hashSetHobby.add(hobby);
        } else {
            throw new NoFreeTimeException("One must not have more than 5 Hobbys");
        }
    }
}
