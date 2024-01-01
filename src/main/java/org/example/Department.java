package org.example;

class Department {

    Employee[] employees = new Employee[20];
    int size = 0;

    void addEmployee(String name, String position, int experience){
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



    Employee[]  getEmployees(){
        return employees;

    }


}