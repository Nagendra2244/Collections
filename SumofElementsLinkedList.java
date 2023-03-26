/* Write a program to find the sum of all the elements in a LinkedList of integers.*/
import java.util.*;
public class SumofElementsLinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        linkedList.add(25);

        int sum=0;
        for (Integer num : linkedList) {
            sum=sum+num;
        }

System.out.println("The sum of all elements in the LinkedList is:" +sum);
    }
}
