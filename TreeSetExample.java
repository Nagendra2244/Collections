import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a new TreeSet object
        TreeSet<String> treeSet = new TreeSet<String>();

        // Add some elements to the TreeSet
        treeSet.add("John");
        treeSet.add("Mary");
        treeSet.add("Peter");
        treeSet.add("David");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Check if the TreeSet contains an element
        if (treeSet.contains("John")) {
            System.out.println("TreeSet contains John");
        } else {
            System.out.println("TreeSet does not contain John");
        }

        // Remove an element from the TreeSet
        treeSet.remove("David");

        // Print the TreeSet again
        System.out.println("TreeSet after removing David: " + treeSet);

        // Print the first and last elements of the TreeSet
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
    }
}
