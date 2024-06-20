package ss9.BaiTap.Tinh_ngay_tiep_theo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayTest {
    @Test
    void testNewDay() {
        int day = 2;
        int month = 1;
        int year = 2018;
        String expected = day + "/" + month + "/" + year;

        String result = NextDay.newDay(1, 1, 2018);
        assertEquals(expected, result);
    }
    @Test
    void testNewDay1() {
        int day = 1;
        int month = 2;
        int year = 2018;
        String expected = day + "/" + month + "/" + year;

        String result = NextDay.newDay(31, 1, 2018);
        assertEquals(expected, result);
    }
    @Test
    void testNewDay2() {
        int day = 1;
        int month = 5;
        int year = 2018;
        String expected = day + "/" + month + "/" + year;

        String result = NextDay.newDay(30, 4, 2018);
        assertEquals(expected, result);
    }
    @Test
    void testNewDay3() {
        int day = 1;
        int month = 3;
        int year = 2018;
        String expected = day + "/" + month + "/" + year;

        String result = NextDay.newDay(28, 2, 2018);
        assertEquals(expected, result);
    }
    @Test
    void testNewDay4() {
        int day = 1;
        int month = 3;
        int year = 2020;
        String expected = day + "/" + month + "/" + year;

        String result = NextDay.newDay(29, 2, 2020);
        assertEquals(expected, result);
    }
    @Test
    void testNewDay5() {
        int day = 1;
        int month = 1;
        int year = 2019;
        String expected = day + "/" + month + "/" + year;

        String result = NextDay.newDay(31, 12, 2018);
        assertEquals(expected, result);
    }
}
