package ss3.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoDuongCheo {

    public static void main(String[] args) {

        //nhập số hàng và cột
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        double[][] matrix = new double[size][size];

        //nhập giá trị cho ma trận
        System.out.println("Enter values for each element in the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextDouble();
                System.out.print("matrix [" + i + "][" + j + "] = ");
            }
        }

        //tính tổng các phần tử trên đường chéo chính
        double diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }

        //in kết quả ra màn hình
        System.out.println("The sum of the diagonal elements is: " + diagonalSum);
        scanner.close();
    }
}
