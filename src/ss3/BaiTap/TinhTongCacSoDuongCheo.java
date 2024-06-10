package ss3.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoDuongCheo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        double[][] matrix = new double[size][size];

        System.out.println("Enter values for each element in the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextDouble();
                System.out.print("matrix [" + i + "][" + j + "] = ");
            }
        }
        double diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("The sum of the diagonal elements is: " + diagonalSum);
        scanner.close();
    }
}
