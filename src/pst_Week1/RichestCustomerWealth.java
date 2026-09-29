package pst_Week1;

import java.util.Scanner;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int maxWealth = 0;

        for (int i = 0; i < m; i++) {
            int wealth = 0;

            for (int j = 0; j < n; j++) {
                wealth += sc.nextInt();
            }

            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        System.out.println(maxWealth);

        sc.close();
    }
}