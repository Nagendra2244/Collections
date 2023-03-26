//Hashset program1
import java.util.HashSet;
public class Hashset2 {
 public static void main(String[] args) {
 // Creating a HashSet
 HashSet<String> hashSet = new HashSet<String>();
 // Adding elements to the HashSet
 hashSet.add("Java");
 hashSet.add("Python");
 hashSet.add("C++");
 hashSet.add("JavaScript");
 // Printing the HashSet
 System.out.println("HashSet: " + hashSet);
 // Removing an element from the HashSet
 hashSet.remove("C++");
 // Printing the HashSet after removing an element
 System.out.println("HashSet after removing an element: " + hashSet);
 // Checking if an element exists in the HashSet
 boolean isExists = hashSet.contains("Java");
 System.out.println("Is Java exists in the HashSet? " + isExists);
 // Clearing the HashSet
 hashSet.clear();
 // Printing the HashSet after clearing
 System.out.println("HashSet after clearing: " + hashSet);
 }
}