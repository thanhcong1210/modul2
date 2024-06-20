package ss9.BaiTap.Tinh_ngay_tiep_theo;

import java.time.LocalDate;

public class NextDay {
    public static String newDay(int day, int month, int year ) {

        LocalDate currentDate = LocalDate.of(year, month, day);
        LocalDate nextDay = currentDate.plusDays(1);
        return nextDay.getDayOfMonth() + "/" + nextDay.getMonthValue() + "/" + nextDay.getYear();

    }
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDay = currentDate.plusDays(0);
        System.out.println(nextDay.getDayOfMonth());
        System.out.println(nextDay.getMonthValue());
        System.out.println(nextDay.getYear());
    }
}
