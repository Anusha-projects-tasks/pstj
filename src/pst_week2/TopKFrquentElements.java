
package pst_week2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Arrays;

public class TopKFrequentElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> frequency.get(a) - frequency.get(b)
        );

        for (int num : frequency.keySet()) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }

        System.out.println("Top " + k + " frequent elements: "
                + Arrays.toString(result));

        sc.close();
    }
}
