
package pst_week2;

import java.util.Scanner;
import java.util.Arrays;

public class SuffleTheArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " array elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }

        System.out.println("Output: " + Arrays.toString(ans));

        sc.close();
    }
}