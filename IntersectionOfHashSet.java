/*Write a program to find the intersection of two HashSet of integers.*/
import java.util.*;

public class IntersectionOfHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

      System.out.println("---HashSet-1&HashSet-2---");
        System.out.println("HashSet-1:"+set1);
        System.out.println("HashSet-2:"+set2);

        // Create a new HashSet for the intersection
        HashSet<Integer> intersection=new HashSet<>(set1);

        // Retain only the elements in the intersection
        intersection.retainAll(set2);
        System.out.println("---After Intersection---");
        System.out.println("Intersection:"+intersection);
    }
}
