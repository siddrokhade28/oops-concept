package org.employeeusingiterface;

public interface Employee {

    //Assume part-time Hour is 4;
     int partTimeHour = 4;
    int Is_full_time=1;
     int Is_Part_Time = 2;

    void checkAttendance();
    void calculateDailyWage();
    void calculatePartTimeWage();
    void calculateMonthlyWage();
    void  monthlyWage();
    void wages();

}
