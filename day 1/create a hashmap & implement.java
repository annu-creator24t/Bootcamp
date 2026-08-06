import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Orange", 80);
        map.put("Mango", 120);

        System.out.println("HashMap: " + map);
        System.out.println("Price of Apple: " + map.get("Apple"));
        System.out.println("Contains Banana? " + map.containsKey("Banana"));
        System.out.println("Contains value 80? " + map.containsValue(80));

        map.remove("Orange");

        System.out.println("After removing Orange: " + map);

        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("Values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("Key-Value Pairs:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println("Using entrySet:");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}