import java.util.*;
public class LinkedlistHashsetDemo{
  public static void main(String[] args){
    // Create LINkedList Hashset
  LinkedHashSet<String> set=new LinkedHashSet<String>();
   //Adding set Elements
    set.add("apple");
     set.add("banana");
     set.add("Tamato");
     set.add("Potato");
      set.add("Alu");
    //Printing Elements of the set
    System.out.println("Linked Handset Elements in set:"+set);
    
    // Removing An Element From the set
    set.remove("banana");
     //Printing Elements of the set again
    System.out.println("Linked Handset Elements in set:"+set);
    boolean containbanana=set.contain("banana");
     System.out.println("Linked Handset Elements in set:"+set);
  }
}