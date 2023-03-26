/*
Write a Java program that prompts the user to enter a string, and then converts that string to "Title Case". "Title Case" means that the first letter of each word in the string should be capitalized, and all other letters should be lowercase.
*/
 
import java.util.Scanner;

public class C20Fri4 {
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
        
      System.out.print("Enter the string: ");
        String str =sc.nextLine().toLowerCase();
       
      String[] letters=str.split(" ");
      String str1 =" ";
      
      for (String letter : letters) {
            if (letter.length()>0) {
            str1=str1+(Character.toUpperCase(letter.charAt(0))+letter.substring(1)+" ");
            }
        }

        System.out.println("Converting of string to First letter capilize is:" + str1);
    }
}