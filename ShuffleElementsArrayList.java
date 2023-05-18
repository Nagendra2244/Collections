/*Implement a program to shuffle the elements of an ArrayList.*/
import java.util.*;

public class ShuffleElementsArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList:"+list);

        Collections.shuffle(list);

        System.out.println("Shuffled ArrayList:"+list);
    }
}
