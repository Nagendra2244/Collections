/*1.Write a program to create an ArrayList of String type and add five elements to it. Then, use a for-each loop to print all the elements in the ArrayList.*/

import java.util.*;

public class WorkArraylist {
    public static void main(String[] args) {
        // Create an ArrayList of String type
        ArrayList<String> arrayList=new ArrayList<String>();

        // Add five elements to the ArrayList
        arrayList.add("element=1");
        arrayList.add("element=2");
        arrayList.add("element=3");
        arrayList.add("element=4");
        arrayList.add("element=5");
        
        // Print all the elements using a for-each loop
       System.out.println("---After for-Each Loop---");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
