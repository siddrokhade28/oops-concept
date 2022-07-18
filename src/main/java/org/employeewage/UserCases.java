package org.employeewage;

public class UserCases {
    //Assume Full Day Hour is 8
    private static final int fullDayHour = 8;
    //Assume part-time Hour is 4;
    private static final int partTimeHour = 4;
    //Assume Wage per Hour is 20
    private static final int wagePerHour = 20;
    //Checks weather Employee is present or not.
    private static final int Is_full_time=1;
    private static final int Is_Part_Time = 2;
    public void empChecker(){
        double empcheck= Math.floor(Math.random()*10)%2;
        if(empcheck==Is_full_time){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }

    }
    public void dailyWage(){
        double empcheck= Math.floor(Math.random()*10)%2;
        if(empcheck==Is_full_time){
            int dailywage= fullDayHour*wagePerHour;
            System.out.println("Daily  Wage is "+dailywage);
        }
        else {
            System.out.println("Part-Time Wage is 0");
        }
    }
    public  void partTimeWage(){
        double empcheck= Math.floor(Math.random()*10)%3;
        if(empcheck==Is_full_time){
            int dailywage= fullDayHour*wagePerHour;
            System.out.println("Daily  Wage is "+dailywage);
        }
        else if(empcheck==Is_Part_Time){
            int partTimeWage= partTimeHour*wagePerHour;
            System.out.println("Part-Time Wage is "+partTimeWage);
        }
        else {
            System.out.println("Part-Time Wage is 0");
        }
    }

}
