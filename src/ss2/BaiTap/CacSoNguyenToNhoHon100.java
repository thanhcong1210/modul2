package ss2.BaiTap;

public class CacSoNguyenToNhoHon100 {
    public static void main(String[] args) {

        //chạy từ 2->99 để kiểm tra tất cả các số trong khoảng này có phải là số nguyên tố hay k
        for (int number = 2; number < 100; number++) {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
