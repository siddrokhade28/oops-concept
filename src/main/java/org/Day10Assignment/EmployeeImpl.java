package org.Day10Assignment;

import java.util.*;
import java.util.HashMap;


public class EmployeeImpl implements Employee {
    Scanner scanner = new Scanner(System.in);
    List<Employe> employeList = new ArrayList<>();
    Employe employe = new Employe();
   CalculateWages cg = new CalculateWages();
   //function to add company details
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
    //function to display all companies
    @Override
    public void DisplayAllComp() {
        for(Employe employe:employeList){
            System.out.println(employe);
        }
    }
    //function to display wage of specific company
    @Override
    public void ShowWage(String company) {
        for(Employe employe:employeList){
            if(employe.getCompany().equals(company)){
                System.out.println("The total Wage of the Company  " + company + " for a month is " + employe.getMonthlyWage() );
                System.out.println("The total Wage of the Company  " + company + " for a day is " + employe.getDailyWage() );

            }
            else {
                System.out.println("Company  not found");
            }
        }
    }
//function to delete a company
    @Override
    public void deleteCompany() {
        if (employeList.isEmpty()) {
            System.out.println("No companies added");
        }
        else {
        System.out.println("the list of companies are: \n");
        for (Employe employe : employeList) {
            System.out.println(employe.getCompany());
        }
        System.out.println("Enter the company name to be deleted\n");
        String company = scanner.next();
            for (Employe employe : employeList) {
                if (employe.getCompany().equals(company)) {
                    employeList.remove(employe);
                    System.out.println(company+" Deleted Successfully");
                }
            }
        }
    }

}

