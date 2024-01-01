package org.example;

public class CalculateSalary {

    public static void main(String[] args) {

        Department department= new Department();


        department.addEmployee("Gökçe Özgüven","Test Analyst", 6);
        department.addEmployee("Hande Demir","Test Team Leader",8);

        Employee[] testDepartment = department.getEmployees();


        System.out.println(testDepartment[0].position+ " unvanı olan " + testDepartment[0].name + " isimli çalışanın aylık maaşı " + testDepartment[0].calculateSalary(35) + " TL");
        System.out.println(testDepartment[1].position+ " unvanı olan " + testDepartment[1].name + " isimli çalışanın aylık maaşı " + testDepartment[1].calculateSalary(28)+ " TL");

    }
}

