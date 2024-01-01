package org.example;

class Employee {
    public String name;
    public String position;
    public int experience;

    public double calculateSalary(int workedDays){

        double extraBonus= 1000;
        int dailySalary = 400;
        int monthlySalary =25;
        double salary = dailySalary*monthlySalary;

        if(workedDays>monthlySalary){
            int extraBonusDays = workedDays -monthlySalary ;
            double extraBonusTotal = extraBonusDays * extraBonus;
            salary += extraBonusTotal ;


        }

        return salary;

    }



}






