package ss18.thuc_hanh.ung_dung_dem_so;

public class Count implements Runnable{
    private Thread myThread;

    public Count() {
       myThread = new Thread(this, "My runnable thread");
        System.out.println("My Thread created " + myThread);
       myThread.start();
    }

    public Thread getMyThread(){
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Printing the count "+ i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("My Thread interrupted");
        }
        System.out.println("My Thread run is over");
    }
}
