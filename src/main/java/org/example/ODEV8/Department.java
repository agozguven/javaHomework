package org.example.ODEV8;

import java.util.ArrayList;
import java.util.List;

public class Department {

    public Male teamLead;
    public List<Person> personList;
    public List<String> assignmentList;

    public Department(Male teamLead) {
        this.teamLead = teamLead;
        this.personList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }


    public void changeTeamLead(Male oldteamLead, Male teamLead1) {
        if(teamLead==oldteamLead){
            teamLead=teamLead1;
        }


    }

    public void addPerson(Person newPerson) {
        personList.add(newPerson);

    }

    public void changePerson(Person oldPerson, Person newPerson) {
        if (personList.contains(oldPerson)) {
            personList.remove(oldPerson);

        } else {
            System.out.println(oldPerson + "is not in personList");
        }
        personList.add(newPerson);
    }
    public void removePerson(Person removedPerson){
        if(personList.contains(removedPerson)){
            personList.remove(removedPerson);
        }
        else{
            System.out.println(removedPerson + "is not in personList");
        }
    }

    public void addMission(String newMission){
        assignmentList.add(newMission);
    }

    public void markAssigmentComplete(String assignment){
        if(assignmentList.contains(assignment)){
            System.out.println(assignment + " is completed");
        }
        else{
            System.out.println(assignment + " is not completed.");
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Team Lead: ").append(teamLead.toString()).append("\n");
        result.append("Personnel List:\n");
        for (Person person : personList) {
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }

}
