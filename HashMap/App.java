package HashMap;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        // keys are unique, but values can be duplicated
        // does not maintain any order, but is memory efficient hashmap<key , value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("cocunut", 1.00);

        // map.remove("apple");

        // System.out.println(map.get("cocunut"));

        // if (map.containsKey("apple")) {
        // System.out.println(map.get("apple"));
        // } else {
        // System.out.println("Key not found");
        // }

        // System.out.println(map.containsValue(1.00));

        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
    }

}
