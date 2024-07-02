package ss18.bai_tap.tao_thread_don_gian;

public class NumberGenerator implements Runnable {
    private int count;

    public NumberGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= count; i++) {
                System.out.println("Count : " + i + ", Hashcode: " + this.hashCode());
                Thread.sleep(500);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Bị gián đoạn");
        }
    }
}

