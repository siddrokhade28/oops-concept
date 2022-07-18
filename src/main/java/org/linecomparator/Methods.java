package org.linecomparator;

import java.util.Scanner;

public class Methods {
    public void acceptInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the X1 Coordinate");
        double x1= s.nextDouble();
        System.out.println("Enter the Y1 Coordinate");
        double y1= s.nextDouble();
        System.out.println("Enter the X2 Coordinate");
        double x2= s.nextDouble();
        System.out.println("Enter the Y2 Coordinate");
        double y2= s.nextDouble();
    }
}
