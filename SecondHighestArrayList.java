/* 1. Write a program to find the second highest element in an ArrayList of integers.*/

import java.util.*;
public class SecondHighestArrayList
{
    public static void main(String[] args)
 {
 ArrayList list=new ArrayList();
        list.add(56);
        list.add(50);
        list.add(76);
        list.add(12);
        list.add(75);
     System.out.println(list);
 Collections.sort(list, Collections.reverseOrder());
     System.out.println("The List After Sort:");
      System.out.println(list);
   System.out.println("The Second Largest in Array is:"+list.get(1));
  }
}