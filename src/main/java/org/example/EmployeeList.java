package org.example;


public class EmployeeList {
    public static void main(String[] args) {

        DepartmentEmp department= new DepartmentEmp();


        department.addEmployee("Gökçe Özgüven","Test Analyst", 6);
        department.addEmployee("Hande Demir","Test Team Leader",8);

        Employee[] testDepartment = department.getEmployees();

        for(int i =0; i<testDepartment.length && testDepartment[i] != null;i++){
            System.out.println("Name: " + testDepartment[i].name + " position: " + testDepartment[i].position + " experience: " + testDepartment[i].experience );
        }







    }
}

