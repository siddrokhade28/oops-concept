package org.linecomparator;

import java.util.Scanner;

public class LineComparator {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the X1 Coordinate of Line 1");
        double x1= s.nextDouble();
        System.out.println("Enter the Y1 Coordinate of Line 1");
        double y1= s.nextDouble();
        System.out.println("Enter the X2 Coordinate of Line 1");
        double x2= s.nextDouble();
        System.out.println("Enter the Y2 Coordinate of Line 1");
        double y2= s.nextDouble();

        Methods methods= new Methods();
        double line1=methods.distanceCalculator(x1,x2,y1,y2);
        System.out.println("length Between two points is "+line1);

        System.out.println("Enter the X1 Coordinate  for line 2");
        double x3= s.nextDouble();
        System.out.println("Enter the Y1 Coordinate for line 2");
        double y3= s.nextDouble();
        System.out.println("Enter the X2 Coordinate for line 2");
        double x4= s.nextDouble();
        System.out.println("Enter the Y2 Coordinate for line 2");
        double y4= s.nextDouble();
        double line2 =methods.distanceCalculator(x3,x4,y3,y4);

        System.out.println("length Between two points is "+line2);
        String Line1= String.valueOf(line1);
        String Line2= String.valueOf(line2);
        methods.comparator(Line1,Line2);



    }
}
