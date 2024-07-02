package ss18.thuc_hanh.racing_cars;

import java.util.Random;

import static ss18.thuc_hanh.racing_cars.Main.DISTANCE;
import static ss18.thuc_hanh.racing_cars.Main.STEP;

public class Car implements Runnable {
    // khai báo tên của xe đua
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // khởi tạo điểm start
        int runDistance = 0;

        //khởi tạo time bắt đầu cuc đua
        long startTime = System.currentTimeMillis();

        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                //random tốc độ KM/H
                int speed = (new Random().nextInt(20));

                //tính toán khoảng cách đã đi được
                runDistance += speed;

                //vẽ đường đã đi của xe
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name+"broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + "Finish in " + (endTime - startTime) / 1000 + "s");
    }
}