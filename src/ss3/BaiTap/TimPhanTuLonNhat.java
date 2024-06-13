package ss3.BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //nhập số hàng và cột
        int rows = scanner.nextInt();
        System.out.print("Enter the number of rows: ");
        int columns = scanner.nextInt();
        System.out.print("Enter the number of columns: ");

        double[][] matrix = new double[rows][columns];

        //nhập các phần tử của ma trận
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextDouble();
                System.out.print("Element at position (" + i + ", " + j + "): ");
            }
        }

        //tìm phần tử lớn nhất trong ma trận
        double max = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        //in kết quả ra màn hình
        System.out.println("The maximum element is " + max);
        System.out.println("Coordinates: (" + maxRow + ", " + maxColumn + ")");
    }
}
