package exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Testing {

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        System.out.println(planets);

        Collections.sort(planets);
        System.out.println(planets);

        String[] planetsArray = new String[planets.size()];
        planets.toArray(planetsArray);
        planetsArray[3] = "Peter Bessey";
        System.out.println(planetsArray[3]);

        ArrayList<Character> charStars = new ArrayList<>();
        charStars.add('a');
        charStars.add('b');
        charStars.add('c');
        System.out.println(charStars);

        ArrayList<String> xcharStars = new ArrayList<>();
        xcharStars.add("a");
        xcharStars.add("b");
        xcharStars.add("c");
        System.out.println(xcharStars);
    }
}
