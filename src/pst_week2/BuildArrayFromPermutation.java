
package pst_week2;

import java.util.Scanner;
import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.println("Output: " + Arrays.toString(ans));

        sc.close();
    }
}
