package ss18.bai_tap.tao_thread_don_gian;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator(10);

        Thread thread = new Thread(numberGenerator);
        thread.start();
    }
}
