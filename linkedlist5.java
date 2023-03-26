/*Write a Java program that creates a LinkedList of String objects, adds the elements to the list using various methods, and then prints the contents of the list using the toString method and a for-each loop.*/
import java.util.*;

class linkedlist5 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("Nagendra");
    list.add("Venkatarao");
    list.add("Pavanjeevi");
    list.add("Pournami");
    list.addFirst("Sai");
    list.addLast("raju");

    System.out.println(list);
    
    System.out.println("Using for-each loop:");
    for (String str : list) {
      System.out.println(str);
    }
  }
}
