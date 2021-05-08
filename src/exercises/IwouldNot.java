package exercises;

import java.util.Arrays;

public class IwouldNot {

    public static void main(String[] args) {
        String myString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] myArray = myString.split("\\.");
        System.out.println(myString);
        //System.out.println(myArray[4]);
        System.out.println(Arrays.toString(myArray));
    }
}
