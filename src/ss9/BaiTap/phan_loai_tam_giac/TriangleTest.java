package ss9.BaiTap.phan_loai_tam_giac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    void checkTriangle() {

        String expected = "Tam giác đều";
        String result = Triangle.checkTriangle(2,2,2);
        assertEquals(expected,result);
    }
    @Test
    void checkTriangle1() {
        String expected = "Tam giác cân";
        String result = Triangle.checkTriangle(2,2,3);
        assertEquals(expected,result);
    }
    @Test
    void checkTriangle2() {
        String expected = "Tam giác thường";
        String result = Triangle.checkTriangle(3,4,5);
        assertEquals(expected, result);
    }
    @Test
    void checkTriangle3() {
        String expected = "Không phải là tam giác";
        String result = Triangle.checkTriangle(8,2,3);
        assertEquals(expected, result);
    }
    @Test
    void checkTriangle4() {
        String expected = "Không phải là tam giác";
        String result = Triangle.checkTriangle(-1,2,1);
        assertEquals(expected, result);
    }
    @Test
    void checkTriangle5() {
        String expected = "Không phải là tam giác";
        String result = Triangle.checkTriangle(0,1,1);
        assertEquals(expected, result);
    }

}
