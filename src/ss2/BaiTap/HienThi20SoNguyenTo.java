package ss2.BaiTap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("cac so nguyen to nhor hon" + count + "la :");
        for (int i = 2; i < count; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isPrime(int numbers) {
        if (numbers < 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(numbers); i++) {
            if (numbers % i == 0){
                return false;
            }
        }
        return true;
    }
}
