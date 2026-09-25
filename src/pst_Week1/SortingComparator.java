package pst_Week1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SortingComparator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] nums = new Integer[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 2 == 0 && b % 2 != 0) {
                    return -1;
                }
                if (a % 2 != 0 && b % 2 == 0) {
                    return 1;
                }
                return 0;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}