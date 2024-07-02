package ss18.bai_tap.tim_so_nguyen_to;

public class Main {
    public static void main(String[] args) {

        LazyPrimeFactorization a = new LazyPrimeFactorization(20);
        OptimizedPrimeFactorization b = new OptimizedPrimeFactorization(20);

        Thread thread = new Thread(a);
        Thread thread2 = new Thread(b);

        thread.start();
        thread2.start();

    }
}
