package ss18.thuc_hanh.tao_luong_bang_Runnable;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread :" + threadName + ", " + i);
                // dừng vòng lặp trong 50ms
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread :" + threadName + "interrupted");
        }
        System.out.println("Thread :" + threadName + "exiting.");
    }

    public void start() {
        System.out.println("Starting" + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}