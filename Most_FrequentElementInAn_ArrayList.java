/*Write a program to find the most frequent element in an ArrayList.
*/
import java.util.ArrayList;
import java.util.Collections;

public class Most_FrequentElementInAn_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(2);

        int maxFrequency = 0;
        Integer mostFrequentElement = null;

        for (Integer element : list) {
            int frequency = Collections.frequency(list, element);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentElement = element;
            }
        }

        System.out.println("The most frequent element is: " + mostFrequentElement);
    }
}
