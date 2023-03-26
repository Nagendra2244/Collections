/*java Program for LinkedHashMap*/

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapExample {
public static void main(String[] args) {
 // Creating a LinkedHashMap with String keys and Integer values
 LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
 // Adding elements to the LinkedHashMap
 linkedHashMap.put("Nine", 9);
 linkedHashMap.put("Ten", 10);
 linkedHashMap.put("Leven", 11);
 linkedHashMap.put("Thirteen", 13);
 // Iterating through the LinkedHashMap and printing the elements
 System.out.println("Elements in the LinkedHashMap:");
 for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
 System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
 }
 // Checking if the LinkedHashMap contains a specific key
 System.out.println("\nLinkedHashMap contains key 'Three': " + linkedHashMap.containsKey("Leven"));
 // Checking if the LinkedHashMap contains a specific value
 System.out.println("LinkedHashMap contains value 5: " + linkedHashMap.containsValue(5));
 // Getting the value of a specific key from the LinkedHashMap
 System.out.println("Value of key 'Ten': " + linkedHashMap.get("Ten"));
 // Removing an element from the LinkedHashMap
 System.out.println("\nRemoving key 'Three' from the LinkedHashMap...");
 linkedHashMap.remove("Leven");
 // Iterating through the LinkedHashMap after removing an element
 System.out.println("\nElements in the LinkedHashMap after removing 'Leven':");
 for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
 System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
 }
 // Getting the size of the LinkedHashMap
 System.out.println("\nSize of the LinkedHashMap: " + linkedHashMap.size());
 // Clearing all the elements from the LinkedHashMap
 System.out.println("\nClearing all the elements from the LinkedHashMap...");
 linkedHashMap.clear();
 // Checking if the LinkedHashMap is empty
 System.out.println("\nLinkedHashMap is empty: " + linkedHashMap.isEmpty());
  }
}