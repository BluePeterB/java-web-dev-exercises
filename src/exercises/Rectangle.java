package exercises;  //Needs to be at top

import java.util.Scanner;  // needs to be below package statement

public class Rectangle {
    public static void main(String[] args) {   //Must have main(String[] args) not Double???
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?:");
        double length = input.nextDouble();
        System.out.println("What is the width of the rectangle?:");
        double width = input.nextDouble();
        System.out.println("What units?  inches-in, feet-ft miles-ml ?");
        String units = input.next();
        System.out.println("The area is " + length * width + " square " + units);

    }

}
