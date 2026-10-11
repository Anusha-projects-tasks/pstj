
package pst_week3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberofDaysBetweenTwoDates {

    public static int daysBetweenDates(String date1, String date2) {
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);

        long days = Math.abs(
            ChronoUnit.DAYS.between(firstDate, secondDate)
        );

        return (int) days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date1 = sc.nextLine();
        String date2 = sc.nextLine();

        int result = daysBetweenDates(date1, date2);

        System.out.println(result);

        sc.close();
    }
}

