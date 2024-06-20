package ss9.BaiTap.tinh_ket_qua_Fizz_Buzz;

public class FizzBuzz {
    public static String checkFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            return "Fizz";
        } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static String numberToWords(int number) {
        String[] one = {"một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
                "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu"};
        if (number < 20) {
            return one[number - 1];
        } else if (number < 100) {
            int first = number / 10;
            int last = number % 10;
            return one[first] + " " + one[last];
        }
        return one[number];
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.checkFizzBuzz(56));
    }
}
