/*Write a Java program that prompts the user to enter a string and a character, and counts the number of occurrences of that character in the string (case-insensitive).*/

import java.util.Scanner;

public class C20Fri1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str =sc.nextLine();
        
        System.out.print("Enter a character: ");
        char ch =sc.next().toLowerCase().charAt(0);
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == ch) {
                count++;
            }
        }
        
        System.out.println("The number of occurrences of '" + ch + "' in the string is: " + count);
    }
}
