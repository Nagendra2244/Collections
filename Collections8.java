//sum
import java.util.*;

class Collections8 {
    public static void main(String args[]){
        int sum=0;
      ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        System.out.println(list);
          
          list.set(0, 7);
        
        System.out.println("Using For Each:");
        for(Integer i : list) {
            System.out.println(i);
        }
        
        System.out.println("After Getting Elements:");
        System.out.println(list.get(2));
        
        System.out.println("After Removing Elements:");
        list.remove(Integer.valueOf(4));
        list.remove(2);
        
        System.out.println("Using Iterator Class:");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Sum of all Elements list:");
         for (int i=0;i<list.size();i++)
          {
            sum=sum+list.get(i);
        }
        
        System.out.println("The sum of all elements in list is: " +sum);
    }
}