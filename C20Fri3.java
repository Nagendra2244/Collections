/*
Write a Java program that reads in two strings from the user, and then prints out the longest common subsequence of the two strings. A subsequence of a string is a sequence of characters that appears in the string in the same order as they appear in the original string, but not necessarily consecutively. For example, the longest common subsequence of the strings "ABCDGH" and "AEDFHR" is "ADH".
*/

import java.util.Scanner;

public class C20Fri3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        int[][] LCS = new int[str1.length()+1][str2.length()+1];
        
        for(int i=0; i<=str1.length(); i++) {
            for(int j=0; j<=str2.length(); j++) {
                if(i == 0 || j == 0) {
                    LCS[i][j] = 0;
                }
                else if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    LCS[i][j] = LCS[i-1][j-1] + 1;
                }
                else {
                    LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
                }
            }
        }
        
        int index = LCS[str1.length()][str2.length()];
        char[] lcs = new char[index];
        int i = str1.length(), j = str2.length();
        
        while(i > 0 && j > 0) {
            if(str1.charAt(i-1) == str2.charAt(j-1)) {
                lcs[index-1] = str1.charAt(i-1);
                i--;
                j--;
                index--;
            }
            else if(LCS[i-1][j] > LCS[i][j-1]) {
                i--;
            }
            else {
                j--;
            }
        }
        
        System.out.print("The longest common subsequence is: ");
        for(int k=0; k<lcs.length; k++) {
            System.out.print(lcs[k]);
        }
    }
}
