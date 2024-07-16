package phuong_tien_giao_thong.view;

import phuong_tien_giao_thong.model.Car;
import phuong_tien_giao_thong.model.MotorBike;
import phuong_tien_giao_thong.model.Truck;
import phuong_tien_giao_thong.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static phuong_tien_giao_thong.view.CompanyManager.getCompany;
import static phuong_tien_giao_thong.view.ReadAndWrite.*;

public class VehicleManager {
    public static void displayMenu() {
        System.out.println("Chọn Chức Năng:");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiện thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
    }
    public static void menuAddVehicle() {
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ôtô");
        System.out.println("3. Thêm  xe máy");
        System.out.println("4. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
    }

    public static void addVehicleTruck(Scanner scanner, List<Truck> truckManager, File fileTruck) throws IOException {
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Tên hãng sản xuất ");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Năm sản xuất");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chủ sở hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Tải trọng ");
        int taiTrong = scanner.nextInt();
        scanner.nextLine();
        Truck truck = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong);
        truckManager.add(truck);
        System.out.println("Đã thêm thành công \n" + truck);
        writeFileTruckAddTruck(fileTruck, truck);
        loadFileTruck(fileTruck, truckManager);
    }

    public static void addVehicleCar(Scanner scanner, List<Car> carManager, File fileCar) throws IOException {
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat1 = scanner.nextLine();
        System.out.println("Tên hãng sản xuất ");
        String hangSanXuat1 = getCompany();
        System.out.println("Năm sản xuất");
        int namSanXuat1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chủ sở hữu");
        String chuSoHuu1 = scanner.nextLine();
        System.out.println("Loại xe");
        String loaiXe = scanner.nextLine();
        System.out.println("Số ghế ngồi");
        int soGheNgoi = scanner.nextInt();
        Car car = new Car(bienKiemSoat1, hangSanXuat1, namSanXuat1, chuSoHuu1, loaiXe, soGheNgoi);
        carManager.add(car);
        System.out.println("Đã thêm thành công \n" + car);
        writeFileCarAddCar(fileCar, car);
        loadFileCar(fileCar, carManager);
    }
    public static void addVehicleMotorBike(Scanner scanner, List<MotorBike> motorBikeManager, File fileMotorBike) throws IOException {
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat2 = scanner.nextLine();
        System.out.println("Tên hãng sản xuất ");
        String hangSanXuat2 = getCompany();
        System.out.println("Năm sản xuất");
        int namSanXuat2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chủ sở hữu");
        String chuSoHuu2 = scanner.nextLine();
        System.out.println("Tải trọng ");
        int congSuat = scanner.nextInt();
        scanner.nextLine();
        MotorBike motorBike = new MotorBike(bienKiemSoat2, hangSanXuat2, namSanXuat2, chuSoHuu2, congSuat);
        motorBikeManager.add(motorBike);
        System.out.println("Đã thêm thành công \n" + motorBike);
        writeFileMotorBikeAddMotorBike(fileMotorBike, motorBike);
        loadFileMotorBike(fileMotorBike, motorBikeManager);
    }
    public static int getChoiceDisplayVehicle(Scanner scanner) {
        System.out.println("1. Hiện thị xe tải");
        System.out.println("2. Hiện thị ôtô");
        System.out.println("3. Hiện thị xe máy");
        System.out.println("4. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceDisplay = Integer.parseInt(scanner.nextLine());
        return choiceDisplay;
    }
    public static void displayTruck(File fileTruck, List<Truck> truckManager) throws IOException {
        loadFileTruck(fileTruck, truckManager);
        for (Vehicle truck : truckManager) {
            System.out.println(truck);
        }
    }
    public static void displayCar(File fileCar, List<Car> carManager) throws IOException {
        loadFileCar(fileCar, carManager);
        for (Vehicle car : carManager) {
            System.out.println(car);
        }
    }
    public static void displayMotorBike(File fileMotorBike, List<MotorBike> motorBikeManager) throws IOException {
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        for (Vehicle motorBike : motorBikeManager) {
            System.out.println(motorBike);
        }
    }
}
