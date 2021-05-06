package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {   //Must have main(String[] args) not Double???
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use?:");
        double gals = input.nextDouble();
        System.out.println("That is " + miles / gals + " miles per gallon.");

    }

}
