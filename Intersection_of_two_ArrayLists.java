/*Implement a program to find the intersection of two ArrayLists (common elements).*/
import java.util.*;
public class Intersection_of_two_ArrayLists{
  public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        ArrayList<Integer> list3=new ArrayList<Integer>(list1);
        list3.retainAll(list2);

        System.out.println("Intersection of ArrayLists:"+list3);
    }
}