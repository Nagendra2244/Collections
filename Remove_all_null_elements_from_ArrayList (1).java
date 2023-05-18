/*Write a program to remove all null elements from an ArrayList.*/
import java.util.ArrayList;

public class Remove_all_null_elements_from_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add(null);
        list.add("Banana");
        list.add(null);
        list.add("Orange");
        list.add(null);
        System.out.println("Original ArrayList: " + list);
        list.removeIf(element -> element == null);
        System.out.println("ArrayList after removing null elements: " + list);
    }
}

/*
import java.util.ArrayList;

public class Remove_all_null_elements_from_ArrayList{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(3);
        list.add(null);
        list.add(5);
        list.add(null);

        System.out.println("Original ArrayList: " + list);

      
        ArrayList<Integer> nonNullList = new ArrayList<Integer>();

        // Iterate over the original list and add non-null elements to the new list
        for (Integer element : list) {
            if (element != null) {
                nonNullList.add(element);
            }
        }

        System.out.println("ArrayList after removing null elements: " + nonNullList);
    }
}

*/