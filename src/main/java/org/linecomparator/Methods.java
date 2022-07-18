package org.linecomparator;

import java.util.Scanner;

public class Methods {

    public  double distanceCalculator(double x1, double x2,double y1,double y2){
        Double length = Math.sqrt((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
        return length;
    }
    public void comparator(String line1 , String line2){
        if(line1.compareTo(line2) >0){
            System.out.println("line 1 is greater");

        } else if (line1.compareTo(line2)<0) {

            System.out.println("line 2 is greater");
        }
        else {
            System.out.println("lines are equal");
        }
    }
}
