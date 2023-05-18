/*Implement a program to find the index of the first occurrence of a specific element in an ArrayList.*/

import java.util.*;

public class First_occurrence_of_specific_element_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        int targetElement = 6;
        int index = findFirstOccurrence(list, targetElement);

        if (index != -1) {
            System.out.println("Index of the first occurrence of " + targetElement + ": " + index);
        } else {
            System.out.println(targetElement + " is not found in the ArrayList.");
        }
    }

    public static int findFirstOccurrence(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}



