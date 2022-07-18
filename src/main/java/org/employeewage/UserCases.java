package org.employeewage;

public class UserCases {
    //Assume Full Day Hour is 8
    private static final int fullDayHour = 8;
    //Assume part-time Hour is 4;
    private static final int partTimeHour = 4;
    //Assume Wage per Hour is 20
    private static final int wagePerHour = 20;
    //Assume 20 Working Day per Month
    private static final int workingdays = 20;
    //total working hours is 100
    private static final int totalHours = 100;

    private static final int Is_full_time=1;
    private static final int Is_Part_Time = 2;
    //Checks weather Employee is present or not.
    public void empChecker(){
        double empcheck= Math.floor(Math.random()*10)%2;
        if(empcheck==Is_full_time){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }
        System.out.println("---------------------------");
        System.out.println();

    }
    //Calculate daily wage
    public void dailyWage(){
        double empcheck= Math.floor(Math.random()*10)%2;
        if(empcheck==Is_full_time){
            int dailywage= fullDayHour*wagePerHour;
            System.out.println("Daily  Wage is "+dailywage);
        }
        else {
            System.out.println("Part-Time Wage is 0");
        }
        System.out.println("---------------------------");

    }
    //Calculate Part time wage
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
        System.out.println("---------------------------");

    }
    //calculating part time and daily wage using switch case
    public  void usingSwitchCase(){
        double empcheck= Math.floor(Math.random()*10)%3;
        System.out.println("------Using Switch Case-------");
        switch ((int) empcheck){
            case 0:
                System.out.println("Part-Time Wage is 0");
                break;
            case 1:
                int dailywage= fullDayHour*wagePerHour;
                System.out.println("Daily  Wage is "+dailywage);
                break;
            case 2:
                int partTimeWage= partTimeHour*wagePerHour;
                System.out.println("Part-Time Wage is "+partTimeWage);
                break;
        }
        System.out.println("---------------------------");


    }
    //calculating wage for the month
    public void monthlyWage(){
        double empcheck= Math.floor(Math.random()*10)%3;
        if(empcheck==Is_full_time){
            int monthlyWage= fullDayHour*wagePerHour*workingdays;
            System.out.println("Monthly Wage of Full time Employee  Wage is "+monthlyWage);
        }
        else if(empcheck==Is_Part_Time){
            int monthlyWage= partTimeHour*wagePerHour*workingdays;
            System.out.println("Monthly Wage Wage of Part Time Employee is "+monthlyWage);
        }
        else {
            System.out.println("Monthly Wage Wage is 0");
        }
        System.out.println("---------------------------");
    }
    public void wages(){
        int workingDays=0;
        int workingHours=0;
        double wage=0;
        double empcheck= Math.floor(Math.random()*10)%3;
        while(workingDays<=20 && workingHours<=100){
            switch ((int)empcheck){
                case 0:
                    System.out.println("employee is absent");
                    System.exit(0);
                    break;
                case 1:
                    workingDays++;
                    workingHours +=8;
                    break;
                case 2:
                    workingDays++;
                    workingHours +=4;
                    break;
            }
            wage=workingHours*wagePerHour;
        }
        System.out.println("total wage "+wage);
    }
}
