package ss18.bai_tap.hien_thi_so_chan_le;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}