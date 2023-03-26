
import java.util.*;
class linkedlist3{
  public static void main(String[] args){
    LinkedList<String> list=new LinkedList<String>();
    list.add("Nagendra");
    list.add("Venkatarao");
    list.add("Pavanjeevi");
    list.add("Pournami");
    list.addFirst("Sai");
    list.addLast("raju");
    System.out.println(list);
    
    System.out.println("Using Iterator Class:");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            }
  }
}