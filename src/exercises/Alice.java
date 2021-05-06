package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {   //Must have main(String[] args) not Double???
        String aAiw = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?";
        String lcPhrase = aAiw.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("What term do you want to search for?:");
        String term = input.next();
        term = term.toLowerCase();
        System.out.print(lcPhrase.contains(term) + "---");
        System.out.print("Index: " + lcPhrase.indexOf(term) + "  Length: " + term.length());
        String cutPhrase = aAiw.replace(term, "");
        System.out.println('\n' + cutPhrase);
    }
}
