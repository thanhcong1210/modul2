package ss3.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //nhập số hàng và cột
        int rows = scanner.nextInt();
        System.out.print("Enter the number of rows: ");
        int columns = scanner.nextInt();
        System.out.print("Enter the number of columns: ");

        double[][] matrix = new double[rows][columns];

        //nhập giá trị cho ma trận
        System.out.println("Enter value for each element in the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextDouble();
                System.out.print("matrix [" + i + "][" + j + "]");
            }
        }

        //tính tổng các số ở một cột xác định
        int columnOrder = scanner.nextInt();
        System.out.print("Enter the index of the column (starting from: 0): ");
        double columnSum = 0;
        for (int i = 0; i < rows; i++) {
            columnSum += matrix[i][columnOrder];
        }

        //hiển thị kết quả ra màn hình
        System.out.println("The sum of the column is: " + columnSum);
        scanner.close();
    }
}
