package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPractise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wordLength;

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,5,8,13,21));
        System.out.println(numbers);
        System.out.println(sumEvenNums(numbers));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        //char [] cArr = {};
        phrase = phrase.replace(',',' ');   //Replace commas with spaces.
        System.out.println("Phase: " + phrase);

        String[] words = phrase.split(" ");
        System.out.println("Words: " + Arrays.toString(words));

        //ArrayList<String> wordList = new ArrayList<>(Arrays.asList("Cat","Peter","Paula","Fred","Jane"));
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
       //wordList.removeAll(" ");  // remove all items containing only a space. Not working
        //wordList.removeAll(Collections.singleton(" "));  // ditto not working
        System.out.println("WordList: " + wordList);



        System.out.println("Enter length of word to search for. (Integer)");
        wordLength = input.nextInt();
        System.out.println(fiveLetters(wordList, wordLength));
        input.close();





    }


        public static int sumEvenNums(ArrayList<Integer> arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }

    public static String fiveLetters(ArrayList<String> arr, int length) {
        String words = "";
        for (String word : arr) {
            if (word.length()  == length) {
                words += (" " + word);
            }
        }
        return words;
    }

}
