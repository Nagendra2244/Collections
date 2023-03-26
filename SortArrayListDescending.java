/*Write a program to sort an ArrayList of strings in descending order.*/
import java.util.*;
public class SortArrayListDescending {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Venkatesh");
        arrayList.add("Rajesh");
        arrayList.add("Kumar");
        arrayList.add("Sravanthi");
        arrayList.add("Dinesh");

        System.out.println("ArrayList before sorting: " + arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());

        System.out.println("ArrayList after sorting in descending order: " + arrayList);
    }
}
