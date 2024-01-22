package org.example.ODEV8;

public class CreateDepartment {

    public static void main(String[] args) {
        Person male1 = new Male("Umut", "Özgüven", "29111990");
        Person female1 = new Female("Gökçe", "Özgüven", "13121990");
        Person male2 = new Male("Buğra", "Deniz", "09011988");
        Male teamLead = new Male("Ufuk", "Gür", "07081987");
        Male teamLead2 = new Male("Taylan", "Pek", "11121987");

        String mission1 = "Ad-hoc test";

        Department department1 = new Department(teamLead);
        department1.addPerson(male1);
        System.out.println(department1.toString());
        department1.addPerson(female1);
        System.out.println(department1.toString());
        department1.addPerson(male2);
        System.out.println(department1.toString());
        department1.removePerson(male2);
        System.out.println(department1.toString());
        department1.changeTeamLead(teamLead,teamLead2);
        System.out.println(department1.toString());
        department1.addMission(mission1);
        System.out.println(department1.assignmentList);
        department1.markAssigmentComplete(mission1);

        System.out.println(male1.toString() + " will be retired at " + male1.calculateRetiredAge() );
        System.out.println(female1.toString() + " will be retired at " + female1.calculateRetiredAge() );




    }
}
