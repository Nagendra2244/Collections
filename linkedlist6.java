import java.util.*;

class linkedlist6 {
  public static void main(String[] args) {
    LinkedList<String> list=new LinkedList<String>();
    list.add("Nagendra");
    list.add("Venkatarao");
    list.add("Pavanjeevi");
    list.add("Pournami");
    list.addFirst("Sai");
    list.addLast("raju");

    System.out.println("Original LinkedList: " + list);

    // Sorting the LinkedList 
    Collections.sort(list);

    System.out.println("Sorted LinkedList: " + list);
  }
}
