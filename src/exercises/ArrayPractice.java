package exercises;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 3, 5, 8};
        for (int i : myArray) {   //For Each
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
