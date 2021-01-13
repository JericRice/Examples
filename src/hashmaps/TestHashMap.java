package hashmaps;

import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {


        HashMap<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "Cindy");
        myMap.put(2, "Joe");
        myMap.put(3, "Mocha");

        System.out.println("The string stored under the key \"3\" is: " + myMap.get(3));
    }
}
