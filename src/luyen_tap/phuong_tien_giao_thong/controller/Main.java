package luyen_tap.phuong_tien_giao_thong.controller;

import java.io.IOException;
import java.util.Scanner;

import static luyen_tap.phuong_tien_giao_thong.view.FactoryVehicle.*;
import static luyen_tap.phuong_tien_giao_thong.view.IView.*;
import static luyen_tap.phuong_tien_giao_thong.view.ReadAndWrite.*;
import static luyen_tap.phuong_tien_giao_thong.view.VehicleManager.displayMenu;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        loadFileTruck(fileTruck, truckManager);
        loadFileCar(fileCar, carManager);
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case ADD_VEHICLE:
                    functionAddVehicle(scanner);
                    break;
                case SHOW_VEHICLE :
                    functionDisplayVehicle(scanner);
                    break;
                case REMOVE_VEHICLE:
                    functionRemoveVehicle(scanner, fileTruck, truckManager, carManager, fileCar, motorBikeManager);
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }
}