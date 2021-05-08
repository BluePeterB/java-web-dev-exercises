package exercises;

import java.util.*;

public class HashMapPractise {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String stringID;
        String studentName;
        int ID;

        System.out.println("Enter your student's ID (or ENTER to finish):");

        // Get student IDs and names
        do {

            System.out.print("ID: ");
            stringID= input.nextLine();

            if (!stringID.equals("")) {
                ID = Integer.parseInt(stringID);
                System.out.print("Name: ");
                studentName = input.nextLine();
                students.put(ID, studentName);

                // Read in the newline before looping back.  WHY?????
               // input.nextLine();
            }

        } while(!stringID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }

    }


}
