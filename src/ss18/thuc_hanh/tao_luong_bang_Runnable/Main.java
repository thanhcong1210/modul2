package ss18.thuc_hanh.tao_luong_bang_Runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("main thread running...");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("main thread stopped!!!");
    }
}
