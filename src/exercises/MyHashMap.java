package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> moons = new HashMap<>();
        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Uranus", 27);
        moons.put("Neptune", 14);
        moons.put("Peter", 57);

        System.out.println(moons.size());
        System.out.println(moons.keySet());
        System.out.println(moons.values());
        System.out.println(moons.containsKey("Peter"));
        System.out.println(moons.containsValue(57));
        System.out.println(moons.get("Uranus"));
    }
}
