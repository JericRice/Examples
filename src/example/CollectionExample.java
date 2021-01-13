package example;

import java.util.ArrayList;

public class CollectionExample {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("Hello");
        arrayList.add(" ");
        arrayList.add("World");
        arrayList.add(3, "!");

        System.out.println("Value at index 2: " + arrayList.get(2));
        System.out.println(arrayList);

    }
}
