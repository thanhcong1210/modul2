package ss9.BaiTap.tinh_ket_qua_Fizz_Buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void checkFizzBuzz() {
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(12);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz2() {
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(23);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz3() {
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(25);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz4() {
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(56);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz5() {
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(15);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz6() {
        String expected = "hai sáu";
        String result = FizzBuzz.checkFizzBuzz(26);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz7() {
        String expected = "chín tám";
        String result = FizzBuzz.checkFizzBuzz(98);
        assertEquals(expected, result);
    }
}
