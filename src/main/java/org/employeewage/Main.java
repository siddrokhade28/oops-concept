package org.employeewage;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Welcome to Employee Wage Computation Program----------");
        UserCases userCases = new UserCases();
        userCases.empChecker();
        userCases.dailyWage();
        userCases.partTimeWage();
        userCases.usingSwitchCase();
        userCases.monthlyWage();

    }
}