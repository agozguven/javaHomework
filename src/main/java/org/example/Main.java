package org.example;


public class Main {
    public static void main(String[] args) {

        Department department= new Department();

        department.addEmployee("Gökçe Özgüven","Test Analyst", 6);
        department.addEmployee("Hande Demir","Test Team Leader",5);

        Employee[] testDepartment = department.getEmployees();

        for(int i =0; i<testDepartment.length && testDepartment[i] != null;i++){
            System.out.println("Name: " + testDepartment[i].name + " position: " + testDepartment[i].position + " experience: " + testDepartment[i].experience);
        }

    }
}

