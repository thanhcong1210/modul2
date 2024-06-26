package ss3.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nhập kích thước mảng
        int size = scanner.nextInt();
        System.out.print("Enter the size of the array: ");

        int[] arr = new int[size];

        //nhập giá trị vào mảng
        System.out.println("Enter the value of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            System.out.print("arr[" + i + "] = ");
        }

        //tìm giá trị nhỏ nhất trong mảng
        int minValue = arr[0];
        for (int i = 1; i < size; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("The minimum value in the array is: " + minValue);
        scanner.close();
    }
}
