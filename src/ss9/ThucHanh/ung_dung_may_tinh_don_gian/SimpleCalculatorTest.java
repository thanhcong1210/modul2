package ss9.ThucHanh.ung_dung_may_tinh_don_gian;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing subtract 0 - 0")
    public void testSubtract0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing subtract 1 - 0")
    public void testSubtract1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing subtract 0 - 1")
    public void testSubtract0And1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing subtract 0 - 0")
    public void testSubtract5And3() {
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}
