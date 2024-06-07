package ss2.BaiTap;

import java.awt.*;
import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles tringle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTringle();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    private static void printIsoscelesTringle() {
    }

    public static void printRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printSquareTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square triangle: ");
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
        System.out.print("Enter the height of the isosceles triangle: ");
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
