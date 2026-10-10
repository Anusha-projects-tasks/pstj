
package pst_week2;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));

        sc.close();
    }
}
