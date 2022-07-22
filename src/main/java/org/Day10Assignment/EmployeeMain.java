package org.Day10Assignment;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee= new EmployeeImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Welcome to Employee Wage Computation Program----------");
        //taking user inputs as per the menu
        while (true) {
            System.out.println("press 1 to E add a company details");

            int ch= scanner.nextInt();
            switch (ch){
                case 1:
                    employee.addCompany();
                    break;

            }

        }
    }
}
