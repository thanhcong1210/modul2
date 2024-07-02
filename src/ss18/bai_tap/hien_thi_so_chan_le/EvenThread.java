package ss18.bai_tap.hien_thi_so_chan_le;

public class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i < 10; i += 2) {
            System.out.println("Số chẵn: " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
        }
    }
}
