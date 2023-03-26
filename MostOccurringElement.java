/* Write a program to find the most occurring element in an ArrayList of strings */
import java.util.*;

public class MostOccurringElement {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        l.add("Naveen");
        l.add("Koushik");
        l.add("Sankar");
        l.add("Sirisha");
        l.add("Naveen");
        l.add("Koushik");
        l.add("Naveen");

       System.out.println("---Elements Adding ArrayList---");
        System.out.println("ArrayList:" +l);

        // Create a HashMap to count the occurrences of each element
        HashMap<String, Integer> counts = new HashMap<>();
        for (String element : l) {
            if (counts.containsKey(element)) {
                counts.put(element, counts.get(element) + 1);
            } else {
                counts.put(element, 1);
            }
        }

        // Find the most occurring element
        String mOE= "";  //mOE=mostOccurringElement
        int maxCount = 0;
        for (String element : counts.keySet()) {
            int count=counts.get(element);
            if (count>maxCount) {
                mOE=element;
                maxCount = count;
            }
        }
     System.out.println("---Most Occurring element---");
        System.out.println("Most Occurring element:"+mOE);
    }
}
