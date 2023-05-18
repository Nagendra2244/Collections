/*Implement a program to sort an ArrayList of strings in ascending order.*/
import java.util.*;

public class SortArrayList_of_strings_in_ascendingOrder{

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Swamy");
        list.add("Nagendra");
        list.add("Venkatesh");
        list.add("sourav");
        list.add("Jyothi");
        list.add("Pavan Reddy");
        list.add("Ranjitha");
        list.add("vinay");
        list.add("Ravi");
        list.add("Pavan Kalyan");

        System.out.println("Before sorting:"+list);

        Collections.sort(list);

        System.out.println("After sorting:"+list);
    }
}

