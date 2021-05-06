package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //double radius = input.nextDouble();
        String sRadius;
        double radius = 0;  // needs to be initialized

        do { System.out.println("What is the radius of the circle?:");
              sRadius = input.next();

              if (!isNumeric(sRadius) ) {
                  System.out.println("Must enter a positive number");
              } else {
                  radius = Double.parseDouble(sRadius);
                  if (radius <= 0) {
                      System.out.println("Must enter a positive number");
                  }
              }
        } while (!isNumeric(sRadius) || radius <= 0);



        System.out.println("The area of the circle of radius" + radius +" is " +  Circle.getArea(radius));
    }

    public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
}

