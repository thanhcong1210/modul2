package ss2.BaiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        /*
        biến choice được sử dụng để lưu lựa chọn của người dùng vào menu
        sử dụng do-while để hiển thị menu và xử lý lựa chọn của người dùng cho đến khi người dùng chọn 4.thoát
        sử dụng switch-case để gọi các phương thức dựa trên lựa chọn của người dùng
         */
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("4. THOÁT");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTringle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("THOÁT");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ!!!");
            }
        } while (choice != 4);
    }

    private static void printIsoscelesTringle() {
    }

    public static void printRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int width = scanner.nextInt();
        System.out.print("Nhập chiều cao của hình chữ nhật: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSquareTringle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của tam giác vuông: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác cân: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = height - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
