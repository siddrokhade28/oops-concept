package org.employeewage;

public class UserCases {
    static int Is_full_time=1;
    //Checks weather Employee is present or not.
    public void empChecker(){
        double empcheck= Math.floor(Math.random()*10)%2;
        if(empcheck==Is_full_time){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }

    }
}
