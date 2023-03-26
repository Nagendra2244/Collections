
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
 public static void main(String[] args) {
 // Creating a HashMap
 HashMap<String, Integer> map = new HashMap<>();
 // Adding key-value pairs to the map
 map.put("John", 25);
 map.put("Alice", 30);
 map.put("Bob", 40);
 // Retrieving values from the map
 int johnAge = map.get("John");
 int aliceAge = map.get("Alice");
 int bobAge = map.get("Bob");
 System.out.println("John's age is " + johnAge);
 System.out.println("Alice's age is " + aliceAge);
 System.out.println("Bob's age is " + bobAge);
 // Updating a value in the map
 map.put("Alice", 35);
 aliceAge = map.get("Alice");
 System.out.println("Alice's new age is " + aliceAge);
 // Removing a key-value pair from the map
 map.remove("Bob");
 System.out.println("Bob's age has been removed from the map");
 // Iterating over the key-value pairs in the map
 System.out.println("Iterating over the key-value pairs in the map:");
 for (Map.Entry<String, Integer> entry : map.entrySet()) {
 String name = entry.getKey();
 int age = entry.getValue();
 System.out.println(name + "'s age is " + age);
 }
 // Checking if a key is present in the map
 boolean johnPresent = map.containsKey("John");
 System.out.println("Is John present in the map? " + johnPresent);
 // Checking if a value is present in the map
 boolean agePresent = map.containsValue(35);
 System.out.println("Is age 35 present in the map? " + agePresent);
 // Clearing the map
 map.clear();
 System.out.println("The map has been cleared");
 }
}

