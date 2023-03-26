// Print the sort list
import java.util.*;
class Collections4
{
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Vinay");
        alist.add("Jyothi");
        alist.add("Ranjitha");
        alist.add("Ravi");
        alist.add(3,"Pavan");
        System.out.println(alist);
        
      System.out.println("After sort");
      Collections.sort(alist);
      System.out.println("Using Iterator Class:");
        Iterator itr=alist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            }
       System.out.println("After sort");
      Collections.sort(list);
    }
}