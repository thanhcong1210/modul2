package ss3.BaiTap;

import java.util.Scanner;

public class GopMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nhập kích thước và phần tử của mảng 1
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter the element of the first array: ");
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        //nhập kích thước và phần tử của mảng 2
        System.out.println("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        System.out.print("Enter the element of the second array: ");
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++){
            System.out.print("Enter element" + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        //tạo mảng 3 có kích thước bằng kích thước của mảng 1 và 2
        int[] array3 = new int[size1 + size2];

        //gộp mảng 1 và 2 vào mảng 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[i + size1] = array2[i];
        }
        //in mảng 3 ra màn hình
        System.out.println("The result is: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "");
        }
    }
}
