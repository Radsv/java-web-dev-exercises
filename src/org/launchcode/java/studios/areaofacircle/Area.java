package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

            double radius;
            double area;
            Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
        input.close();
        //area = (3.14*(radius*radius));
         area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);

    }
}
