/*Java Program for TreeMapExample */
import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
    // Create a TreeMap
    TreeMap<String, Integer> map = new TreeMap<>();
     // Add elements to the TreeMap
       map.put("Dinesh", 26);
       map.put("Nagendra", 26);
       map.put("Raju", 18);
       map.put("Naveen", 31);
       // Display the TreeMap
     System.out.println("TreeMap: " + map);
     // Get the value associated with a key
          int age = map.get("Dinesh");
     System.out.println("Dinesh's age is " + age);
     // Remove an element from the TreeMap
         map.remove("Raju");
      System.out.println("TreeMap after removing Alice: " + map);
      // Iterate through the TreeMap
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
         String key = entry.getKey();
          int value = entry.getValue();
          System.out.println(key + " => " + value);
        }
    }
}
