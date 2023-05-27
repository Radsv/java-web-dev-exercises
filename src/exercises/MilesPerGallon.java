package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){

        double miles;
        double gallons;
        double consumed;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles = input.nextDouble();

        System.out.println("How many gallons did you use?");
        gallons = input.nextDouble();

        input.close();

        consumed = (miles/gallons);
        System.out.println("The miles per gallon is :" + consumed);
    }
}
