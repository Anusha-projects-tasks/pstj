
package pst_week2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        List<List<String>> result = new ArrayList<>(map.values());

        System.out.println("Grouped anagrams: " + result);

        sc.close();
    }
}
