
package pst_week2;

import java.util.Scanner;

public class FindTheHighestAltitude {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter the gain elements:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int altitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < n; i++) {
            altitude = altitude + gain[i];

            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }

        System.out.println("Highest altitude: " + maxAltitude);

        sc.close();
    }
}