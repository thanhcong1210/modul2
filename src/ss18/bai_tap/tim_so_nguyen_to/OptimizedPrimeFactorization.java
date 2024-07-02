package ss18.bai_tap.tim_so_nguyen_to;

public class OptimizedPrimeFactorization implements Runnable{
    private int number;

    public OptimizedPrimeFactorization(int number) {
        this.number = number;
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    @Override
    public void run() {
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime : Tối ưu");
            }
        }
    }
}
