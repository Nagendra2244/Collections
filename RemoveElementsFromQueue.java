/*Write a program to remove all the elements from a Queue that are less than a given value.*/
import java.util.*;
public class RemoveElementsFromQueue {
    voi display(){
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int limit = 35;
          
        System.out.println("Queue before removing elements:"+q);
    
        while (!q.isEmpty() && q.peek() < limit) {
            q.poll();
        }
       
       
        System.out.println("Queue after removing elements:"+q);
    }
 public static void main(String[] args) {
   RemoveElementsFromQueue ref=new RemoveElementsFromQueue();
             ref.display();
}

}