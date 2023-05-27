package exercises;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;

        int tempsRead = 0;
        int numberOfTemps = Integer.parseInt(args[0]);
        input = new Scanner(System.in);
        while (tempsRead < numberOfTemps) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            fahrenheit = input.nextDouble();
            celsius = (fahrenheit - 32) * 5/9;
            System.out.println("The temperature in Celsius is: " + celsius + "°C");
            tempsRead++;
        }
        input.close();
    }
}

