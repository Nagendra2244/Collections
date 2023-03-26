/*Write a program to remove all the duplicates from an ArrayList of Strings. */
import java.util.*;
public class DuplicatesArrayList {

    public static void main(String[] args) {

        List<String> lwd=new ArrayList<>();  //lwd=listWithDuplicates
        lwd.add("NagendraBabu");
        lwd.add("Anjaneyula");
        lwd.add("Charan");
        lwd.add("NagendraBabu");
        lwd.add("Prasanna");
        lwd.add("Charan");
        lwd.add("Venkatesh");
         System.out.println("---ArrayList with duplicates---");
        System.out.println("ArrayList with duplicates: " +lwd);

      Set<String> setWithoutDuplicates = new HashSet<>(lwd);
        List<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
       System.out.println("---ArrayList without duplicates---");
        System.out.println("ArrayList without duplicates:" + lwd);  
    
    }
}
