package org.example.ODEV8;

public class Female extends Person{
    public Female(String name, String lastName, String birthDate) {
        super(name, lastName, birthDate);
    }

    @Override
    public int calculateRetiredAge() {
        int retirementAge = 60;
        int birthYear = Integer.parseInt(birthDate.split("-")[0]);
        return birthYear + retirementAge;

    }
}
