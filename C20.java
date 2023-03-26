/*Write a Java program to convert the first letter of each word in a given string to uppercase using loops.*/

import java.util.Scanner;

public class C20 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
           String s1; 
          String st2 =" ";
         boolean value;
        System.out.println("Enter the string:");
        s1=sc.nextLine();
        if (s1==null||s1.isEmpty()){
            return;
        }
        s1=s1.toLowerCase(); 
        value=true;
        for (int i=0;i<s1.length();i++) {
            char ch=s1.charAt(i);
            if (value && ch >='a'&&ch <='z') {
                ch=(char)(ch -'a'+'A');
            }
            st2=st2+ch;
            value=(ch==' '); 
        }
        System.out.println("Given first letter of each word in uppercase:" +st2);
    }
}
