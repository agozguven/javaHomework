package org.example.ODEV8;

public abstract class Person {

    private String name;
    private String lastName;
    String birthDate;

    public Person(String name, String lastName, String birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public abstract int calculateRetiredAge();



    @Override
    public String toString() {
        return name + " " + lastName;
    }
}


