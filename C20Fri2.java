/*
Write a Java program that prompts the user to enter a series of numbers (separated by spaces) and then rearranges the numbers such that all the odd numbers come first, followed by all the even numbers. The program should then print the rearranged list of numbers.
*/

import java.util.Scanner;

public class C20Fri2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
      System.out.println("Enter a series of numbers separated by spaces: ");
        String[] nums =sc.nextLine().split(" ");

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        int oddIndex = 0;
        int evenIndex = arr.length - 1;

        while (oddIndex < evenIndex) {
            while (arr[oddIndex] % 2 == 1 && oddIndex < evenIndex) {
                oddIndex++;
            }
            while (arr[evenIndex] % 2 == 0 && oddIndex < evenIndex) {
                evenIndex--;
            }

            if (oddIndex < evenIndex) {
                int temp = arr[oddIndex];
                arr[oddIndex] = arr[evenIndex];
                arr[evenIndex] = temp;
            }
        }

        System.out.print("Rearranged list: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
