//sum of the array list values
import java.util.*;

class Collections7 {
    public static void main(String args[]){
       int sum=0;
         int i;
      ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(5);
        list.addLast(6);
        for (i=0;i<list.size();i++)
          {
            sum=sum+list.get(i);
        }
        
        System.out.println("The sum of all elements in the list is: " +sum);
    }
}
