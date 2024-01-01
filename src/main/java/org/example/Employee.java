package org.example;

class Employee {
    public String name;
    public String position;
    public int experience;

    public double calculateSalary(int workedDays){

        double extraBonus= 1000;
        int dailySalary = 400;
        int monthlyWorkingDays =25;
        double salary = dailySalary*monthlyWorkingDays;

        if(workedDays>monthlyWorkingDays){
            int extraBonusDays = workedDays -monthlyWorkingDays ;
            double extraBonusTotal = extraBonusDays * extraBonus;
            salary += extraBonusTotal ;


        }

        return salary;

    }



}






