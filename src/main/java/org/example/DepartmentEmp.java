package org.example;


public class DepartmentEmp {

    Employee[] employees = new Employee[20];
    int size = 0;


    public void addEmployee(String name, String position, int experience){
        if(size< employees.length){
            Employee employee = new Employee();
            employee.name = name;
            employee.position = position;
            employee.experience=experience;


            employees[size] = employee;
            size++;
        }
        else {
            System.out.println("Bu departmanın çalışan sayısı doldu");
        }
    }



    public Employee[]  getEmployees(){
        return employees;

    }


}