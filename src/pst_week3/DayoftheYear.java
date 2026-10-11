
package pst_week3;

import java.time.LocalDate;
import java.util.Scanner;

public class DayOfTheYear {

    public static int dayOfYear(String date) {
        LocalDate localDate = LocalDate.parse(date);

        return localDate.getDayOfYear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        int result = dayOfYear(date);

        System.out.println(result);

        sc.close();
    }
}
