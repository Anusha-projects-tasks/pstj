
package pst_week2;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class JavaHashSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String pair = sc.nextLine();

            pairs.add(pair);

            System.out.println(pairs.size());
        }

        sc.close();
    }
}