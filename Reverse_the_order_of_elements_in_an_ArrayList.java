/*Implement a program to reverse the order of elements in an ArrayList.*/
import java.util.ArrayList;

public class Reverse_the_order_of_elements_in_an_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList:"+list);

        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }

        System.out.println("Reversed ArrayList:"+list);
    }
}
