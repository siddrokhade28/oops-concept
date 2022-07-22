package org.employeeusingiterface;

public class EmployeeImpl implements Employee {
    double empcheck;
    int workingdays ;
    int fullDayHour ;
    int wagePerHour ;


    public EmployeeImpl(int wagePerHour, int workingdays, int fullDayHour){
        this.fullDayHour=fullDayHour;
        this.wagePerHour=wagePerHour;
        this.workingdays=workingdays;
        //System.out.println("fullDayHour:"+fullDayHour+"wagePerHour :"+wagePerHour+"workingdays :"+workingdays);


    }


    @Override
    public void checkAttendance() {
         empcheck= Math.floor(Math.random()*10)%2;
        if(empcheck==Is_full_time){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }
        System.out.println("---------------------------");
        System.out.println();

    }

    @Override
    public void calculateDailyWage() {
         empcheck= Math.floor(Math.random()*10)%2;

        if(empcheck==Is_full_time){
            int dailywage= fullDayHour*wagePerHour;
            System.out.println("Daily  Wage is "+dailywage);
        }
        else {
            System.out.println("Employee is absent");
        }
        System.out.println("---------------------------");

    }

    @Override
    public void calculatePartTimeWage() {
         empcheck= Math.floor(Math.random()*10)%3;
         if(empcheck==Is_Part_Time){
            int partTimeWage= partTimeHour*wagePerHour;
            System.out.println("Part-Time Wage is "+partTimeWage);
        }
        else {
            System.out.println("Employee is not Part Time Worker");
        }
        System.out.println("---------------------------");

    }

    @Override
    public void calculateMonthlyWage() {
        empcheck = Math.floor(Math.random() * 10) % 3;
        System.out.println("~~~~~~~~~~~~~~~~Using Switch Case~~~~~~~~~~~~~~~~");
        switch ((int) empcheck) {
            case 0:
                System.out.println("Emplyee is Absent");
                break;
            case 1:
                int dailywage = fullDayHour * wagePerHour;
                System.out.println("Monthly Wage of a Full Time Employee is " + dailywage);
                break;
            case 2:
                int partTimeWage = partTimeHour * wagePerHour;
                System.out.println("Monthly Wage of a Part-Time Employee is " + partTimeWage);
                break;

        }
        System.out.println("---------------------------");
    }

    @Override
    public void monthlyWage() {
         empcheck= Math.floor(Math.random()*10)%3;
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

    //Calculating Wage with condition workingDays<=20 && workingHours<=100
    @Override
    public void wages() {
        int workingDays=0;
        int workingHours=0;
        double wage=0;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Calculating Wage with condition workingDays<=20 and workingHours<=100");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
         empcheck= Math.floor(Math.random()*10)%2;
        while(workingDays<=20 && workingHours<=100){
            switch ((int)empcheck){
                case 0:
                    workingDays++;
                    workingHours +=8;
                    break;
                case 1:
                    workingDays++;
                    workingHours +=4;
                    break;
            }
            wage=workingHours*wagePerHour;
        }
        System.out.println("total wage "+wage);

    }

}

