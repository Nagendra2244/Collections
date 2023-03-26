/*Write a program to shuffle the elements of an ArrayList of integers.*/

import java.util.*;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println("ArrayList before shuffling:"+l);

        Collections.shuffle(l);

        System.out.println("ArrayList after shuffling:"+l);
    }
}
