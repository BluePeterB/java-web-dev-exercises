package org.launchcode.java.studio.countingcharacters;

//import javax.swing.text.StyleConstants;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;



public class CountCharacters {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> charCount = new HashMap<>();

        String text = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";
/*      RETRIEVE TEXT FROM FILE NOT YET WORKING
        Path fileName = Paths.get("C:/", "Users", "peter", "Desktop", "JAVA", "Chap1", "java-web-dev-exercises", "quadratics.txt");
        System.out.println("FileName: " + fileName);  //java: cannot find symbol
        String content = Files.readString(fileName);
        System.out.println("Content: " + content);
*/

        char[] charactersInString = text.toCharArray();
        // System.out.println("CharInString" + Arrays.toString(charactersInString));
        //ArrayList<char> chars = new ArrayList<>(Arrays.asList(charactersInString);
        int count = 0;
        for (char i : charactersInString) {
            if (!charCount.containsKey(i)) {
                charCount.put(i,0);   //put key as this char with count of zero
            }
            count = charCount.get(i); //get current count for this character
            count++;
            charCount.put(i,count); // add one to this character's count.


        }
        //System.out.println("ncount: " + count);
        //System.out.println("charCount: " + charCount);

        for (Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
