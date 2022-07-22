package org.employeeusingiterface;

import org.addressbook.Contacts;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Welcome to Employee Wage Computation Program----------");
        //taking the company name
        while (true) {
            System.out.println("Enter the Company Name");
            String companyName = scanner.nextLine();
            //taking the inputs for individual Company
            System.out.println("please Enter the " + companyName + " Wage Per Hours");
            int wagePerHour = scanner.nextInt();
            System.out.println("please Enter the " + companyName + " Total Working Days");
            int workingdays = scanner.nextInt();
            System.out.println("please Enter the " + companyName + " Full Day Working Hour");
            int fullDayHour = scanner.nextInt();
            //creating a parametrized constructor
            Employee employee = new EmployeeImpl(wagePerHour, workingdays, fullDayHour);
            employee.checkAttendance();
            employee.calculateDailyWage();
            employee.calculateDailyWage();
            employee.calculatePartTimeWage();
            employee.calculateMonthlyWage();
            employee.monthlyWage();
            employee.wages();
            System.out.println();
            scanner.nextLine();
            System.out.println("If You like to Calculate Wages for another Company Enter YES else NO");
            String status= scanner.next();
            scanner.nextLine();
            if(status.equals("NO")){
                System.out.println("Thank you for using Employee Wage Computation Program");
                break;

            }


        }



    }
}
