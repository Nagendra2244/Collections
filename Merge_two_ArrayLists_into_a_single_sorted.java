/*Write a program to merge two ArrayLists into a single sorted ArrayList.*/

import java.util.*;
public class Merge_two_ArrayLists_into_a_single_sorted{
   public static void main(String[] args) {
      ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(2);
        list1.add(4);
        list1.add(6);

     ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
   ArrayList<Integer> list3=new ArrayList<Integer>(list1);
        list3.addAll(list2);
        Collections.sort(list3);
    System.out.println("Merged and sorted ArrayList:"+list3);
    }
}
