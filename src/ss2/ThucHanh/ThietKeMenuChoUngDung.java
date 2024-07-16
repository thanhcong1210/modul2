package ss2.ThucHanh;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("0. THOÁT");
            System.out.println("1. THÊM");
            System.out.println("2. XÓA");
            System.out.println("3. CẬP NHẬT");
            System.out.println("xin mời bạn nhập lựa chọn: ");
            while (true){
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("THÊM");
                        System.out.println("******");
                        System.out.println("*****");
                        System.out.println("****");
                        System.out.println("***");
                        System.out.println("**");
                        System.out.println("*");
                        break;
                    case 2:
                        System.out.println("XÓA");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                    case 3:
                        System.out.println("CẬP NHẬT");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Không hợp lệ!!!");
                        break;
                }
            }

        }
}
