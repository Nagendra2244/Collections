 /*Write a program to find the maximum and minimum values in a TreeMap of integers.*/
import java.util.*;
public class TreeMapMinMax {
    public static void main(String[] args) {
        int minKey;
        String minValue;
        int maxKey;
         String maxValue;
      TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "cocola");
        treeMap.put(20, "Thumsup");
        treeMap.put(30, "Sprite");
        treeMap.put(40, "Lemon");
        treeMap.put(50, "Pepsi");

        maxKey=treeMap.lastKey();
        maxValue=treeMap.get(maxKey);

        minKey=treeMap.firstKey();
        minValue=treeMap.get(minKey);

        System.out.println("Maximum value in the TreeMap:" +maxValue);
        System.out.println("Minimum value in the TreeMap:" +minValue);
    }
}
