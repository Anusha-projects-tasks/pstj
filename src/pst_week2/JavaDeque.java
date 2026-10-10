
package pst_week2;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public class JavaDequeue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> unique = new HashSet<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            deque.addLast(num);
            unique.add(num);

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, unique.size());

                int first = deque.removeFirst();

                if (!deque.contains(first)) {
                    unique.remove(first);
                }
            }
        }

        System.out.println(maxUnique);

        sc.close();
    }
}