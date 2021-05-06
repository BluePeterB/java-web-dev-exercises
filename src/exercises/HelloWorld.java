package exercises;  //Needs to be at top

import java.util.Scanner;  // needs to be below package statement




public class HelloWorld {
    public static void main(String[] args) {   //Must have main with String[] args
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);

    }
}
