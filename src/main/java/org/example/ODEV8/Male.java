package org.example.ODEV8;

public class Male extends Person{
    public Male(String name, String lastName, String birthDate) {
        super(name, lastName, birthDate);
    }

    @Override
    public int calculateRetiredAge() {
        int retirementAge = 65;
        int birthYear = Integer.parseInt(birthDate.split("-")[0]);
        return birthYear + retirementAge;
    }
}
