package org.Day10Assignment;

public class Employe {

    // creating class to set all the variables
    //pojo class
    public  String company;
    public  int wagePerHour;
    public  int totalWorkingDays;
    public  int fullDayHour;
    public  int dailyWage;
    public int monthlyWage;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getFullDayHour() {
        return fullDayHour;
    }

    public void setFullDayHour(int fullDayHour) {
        this.fullDayHour = fullDayHour;
    }

    public int getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(int dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getMonthlyWage() {
        return monthlyWage;
    }

    public void setMonthlyWage(int monthlyWage) {
        this.monthlyWage = monthlyWage;
    }

    public Employe() {
    }


    public Employe(String company, int wagePerHour, int totalWorkingDays, int fullDayHour, int dailyWage, int monthlyWage) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.totalWorkingDays = totalWorkingDays;
        this.fullDayHour = fullDayHour;
        this.dailyWage = dailyWage;
        this.monthlyWage = monthlyWage;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "company='" + company + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", totalWorkingDays=" + totalWorkingDays +
                ", fullDayHour=" + fullDayHour +
                ", dailyWage=" + dailyWage +
                ", monthlyWage=" + monthlyWage +
                '}';
    }
}
