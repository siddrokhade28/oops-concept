package org.Day10Assignment;

public class CalculateWages {
    int Is_full_time = 1;
    //function to calculate daily wage
    public int dailyWage(int fullDayHour,int wagePerHour ) {
        int dailywage=0;
        dailywage= fullDayHour*wagePerHour;
        //System.out.println("Daily  Wage is "+dailywage);
        return dailywage;
    }

    //Function to Calculate Monthly Wage

    public int monthlyWage(int fullDayWork, int  wagePerHour , int totalDays)
    {
        int monthSalary = 0 ;
        monthSalary = fullDayWork * wagePerHour * totalDays;
        return monthSalary;
    }
    public int checkAttendance() {
        double empcheck= Math.floor(Math.random()*10)%2;
        if(empcheck==Is_full_time){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }
        System.out.println("---------------------------");
        System.out.println();
        return (int)empcheck;
    }
}
