//Arraylist add the names by using String class
import java.util.*;
class Collections1
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
    }