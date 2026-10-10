
package pst_week2;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the value to remove: ");
        int val = sc.nextInt();

        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Number of elements remaining: " + k);

        System.out.print("Array after removing " + val + ": ");
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));

        sc.close();
    }
}
