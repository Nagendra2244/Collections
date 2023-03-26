import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        System.out.println(numbers);
    
        numbers.set(0, 7);
        
        System.out.println("Using For Each:");
        for(Integer number : numbers) {
            System.out.println(number);
        }
        
        System.out.println("After Getting Elements:");
        System.out.println(numbers.get(2));
        
        System.out.println("After Removing Elements:");
        numbers.remove(Integer.valueOf(4));
        numbers.remove(2);
        
        System.out.println("Using Iterator Class:");
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("The Elements in an Array is:");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
