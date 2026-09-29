package pst_Week1;

import java.util.Scanner;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            System.out.print(sum + " ");
        }

        sc.close();
    }
}
