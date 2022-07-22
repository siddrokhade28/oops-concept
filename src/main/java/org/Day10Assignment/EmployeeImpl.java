package org.Day10Assignment;

import java.util.*;
import java.util.HashMap;


public class EmployeeImpl implements Employee {
    Scanner scanner = new Scanner(System.in);
    List<Employe> employeList = new ArrayList<>();
    Employe employe = new Employe();
   CalculateWages cg = new CalculateWages();
    @Override
    public void addCompany() {
        System.out.println("Enter the Company Name");
        String companyName = scanner.next();
        //taking the inputs for individual Company
        System.out.println("please Enter the " + companyName + " Wage Per Hours");
        int wagePerHour = scanner.nextInt();
        System.out.println("please Enter the " + companyName + " Total Working Days in a month");
        int totalWorkingdays = scanner.nextInt();
        System.out.println("please Enter the " + companyName + " Full Day Working Hour");
        int fullDayHour = scanner.nextInt();
        int dailyWage=cg.dailyWage(fullDayHour,wagePerHour);
        int monthlyWage= cg.monthlyWage(fullDayHour, wagePerHour,totalWorkingdays);
        employe = new Employe(companyName,wagePerHour,totalWorkingdays,fullDayHour,dailyWage,monthlyWage);
        employeList.add(employe);
        System.out.println(employeList);
    }
    @Override
    public void DisplayAllComp() {
        for(Employe employe:employeList){
            System.out.println(employe);
        }
    }

}

