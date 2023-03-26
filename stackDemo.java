import java.util.*;
class stackDemo{
  public static void main(String[] args){
    Stack<String> Stack=new Stack<String>();
    Stack.push("NAGENDRA");
    Stack.push("DINESH");
    Stack.push("SIVA");
    Stack.push("PRASANNA");
    Stack.push("GOPI");
    Stack.push("HAREESH");
    Stack.pop();
  System.out.println("Using Iterator Class:");
    Iterator<String>itr=Stack.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}