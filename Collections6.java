// Arrayist adding integer Values
import java.util.*;

class Collections6 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        System.out.println(list);
    
        //Collections.sort(list);
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
        
        System.out.println("The Elements in an Array is:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
     
    }
}
