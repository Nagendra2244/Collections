import java.util.*;
public class Hashset{
  public static void main(String args[]){
    //Creating Hash Set and Adding Elements
    HashSet<String> set=new HashSet<String>();
    set.add("Ravi");
    set.add("Rajesh");
    set.add("Ravi");
    set.add("Srinivas");
    //Traversing Elements
    Iterator<String> itr=set.iterator();
     while(itr.hasNext()){
            System.out.println(itr.next());
            }
  }
}