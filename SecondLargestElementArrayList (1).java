/*Write a program to find the second largest element in an ArrayList.*/
import java.util.ArrayList;

public class SecondLargestElementArrayList{
  public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(9);
        list.add(6);

        int largest=0;
        int secondLargest=0;

        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest element:"+secondLargest);
    }
}
