/*Write a program to remove duplicate elements from an ArrayList.*/

import java.util.*;

public class RemoveDuplicatesFromArrayList{

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
           list.add(21);
           list.add(30);
           list.add(22);
           list.add(22);
           list.add(32);
           list.add(51);
           list.add(18);
           list.add(22);
           
        System.out.println("Before removing duplicates:"+list);

        ArrayList<Integer> values = new ArrayList<Integer>();
        for (Integer List : list) {
            if (!values.contains(List)) {
                values.add(List);
            }
        }

        System.out.println("After removing duplicates:"+values);
    }
}
