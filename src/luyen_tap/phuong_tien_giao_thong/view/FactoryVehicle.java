package luyen_tap.phuong_tien_giao_thong.view;

import luyen_tap.phuong_tien_giao_thong.model.Car;
import luyen_tap.phuong_tien_giao_thong.model.MotorBike;
import luyen_tap.phuong_tien_giao_thong.model.Truck;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static luyen_tap.phuong_tien_giao_thong.view.ReadAndWrite.*;
import static luyen_tap.phuong_tien_giao_thong.view.VehicleManager.*;

public class FactoryVehicle {
    public static String linkFileTruck = "src/luyen_tap.phuong_tien_giao_thong/batchs.csv/truck.txt";
    public static String linkFileCar = "src/luyen_tap.phuong_tien_giao_thong/batchs.csv/car.txt";
    public static String linkFileMotorBike = "src/luyen_tap.phuong_tien_giao_thong/batchs.csv/motorbike.txt";
    public static List<Truck> truckManager = new ArrayList<>();
    public static List<Car> carManager = new ArrayList<>();
    public static List<MotorBike> motorBikeManager = new ArrayList<>();
    public static  File fileTruck = new File(linkFileTruck);
    public static File fileCar = new File(linkFileCar);
    public static  File fileMotorBike = new File(linkFileMotorBike);
    public static void functionAddVehicle(Scanner scanner) throws IOException {
        boolean addVehicle = true;
        while (addVehicle) {
            menuAddVehicle();
            int choiceThem = scanner.nextInt();
            scanner.nextLine();
            switch (choiceThem) {
                case 1:
                    addVehicleTruck(scanner, truckManager, fileTruck);
                    break;
                case 2:
                    addVehicleCar(scanner, carManager, fileCar);
                    break;
                case 3:
                    addVehicleMotorBike(scanner, motorBikeManager, fileMotorBike);
                    break;
                case 4:
                    addVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng chọn không hợp lệ");
            }
        }

    }
    public static void functionDisplayVehicle(Scanner scanner) throws IOException {
        boolean displayVehicle = true;
        while (displayVehicle) {
            int choiceDisplay = getChoiceDisplayVehicle(scanner);
            switch (choiceDisplay) {
                case 1:
                    displayTruck(fileTruck, truckManager);
                    break;
                case 2:
                    displayCar(fileCar, carManager);
                    break;
                case 3:
                    displayMotorBike(fileMotorBike, motorBikeManager);
                    break;
                case 4:
                    displayVehicle = false;
                    break;
                default:
                    System.out.println("Vui long nhap lai");

            }
        }
    }
    public static void functionRemoveVehicle(Scanner scanner, File fileTruck, List<Truck> truckManager, List<Car> carManager, File fileCar, List<MotorBike> motorBikeManager) throws IOException {
        System.out.println("Enter chọn biển số xóa");
        String licensePlatesRemove = scanner.nextLine();
        boolean isLicensePlatesRemove = false;
        loadFileTruck(fileTruck, truckManager);
        List<Truck> trucksToKeep = new ArrayList<>();
        for (Truck truck : truckManager) {
            if (!truck.getLicensePlates().equals(licensePlatesRemove)) {
                trucksToKeep.add(truck);
            } else {
                System.out.println("Xoa thanh cong " + truck);
                isLicensePlatesRemove = true;
            }
        }
        truckManager.clear();
        truckManager.addAll(trucksToKeep);
        writeFileTruck(fileTruck, truckManager);


        List<Car> carToKeep = new ArrayList<>();
        for (Car car : carManager) {
            if (!car.getLicensePlates().equals(licensePlatesRemove)) {
                carToKeep.add(car);
            } else {
                System.out.println("Xoa thanh cong " + car);
                isLicensePlatesRemove = true;
            }
        }
        carManager.clear();
        carManager.addAll(carToKeep);
        writeFileCar(fileCar, carManager);
        List<MotorBike> motorBikeToKeep = new ArrayList<>();
        for (MotorBike motorBike : motorBikeManager) {
            if (!motorBike.getLicensePlates().equals(licensePlatesRemove)) {
                motorBikeToKeep.add(motorBike);
            } else {
                System.out.println("Xoa thanh cong " + motorBike);
                isLicensePlatesRemove = true;
            }
        }
        motorBikeManager.clear();
        motorBikeManager.addAll(motorBikeToKeep);
        writeFileMotorBike(fileTruck, motorBikeManager);
        if (!isLicensePlatesRemove){
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }
}
