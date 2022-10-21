package JAVA_Code.Programms;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.print("Enter the total no. of Elements = ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements in the Array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        System.out.println("Max is = " + max);
        System.out.println("Min is = " + min);
    }
}
