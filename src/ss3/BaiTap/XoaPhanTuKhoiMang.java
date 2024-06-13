package ss3.BaiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // nhập kích thước của mảng
        int size = scanner.nextInt();
        System.out.print("Enter the size of the array: ");

        int[] array = new int[size];

        // nhập các phần tử của mảng
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // nhập phần tử cần xóa
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // tìm vị trí của phần tử cần xóa trong mảng
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToRemove) {
                position = i;
                break;
            }
        }

        // xóa phần tử tại vị trí position trong mảng
        if (position != -1) {
            // di chuyển các phần tử trong mảng sang trái 1 vị trí
            for (int i = position; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            // cập nhật kích thước mảng sau khi xóa phần tử
            size--;

            System.out.println("Element " + elementToRemove + " has been removed from the array.");
        } else {
            System.out.println("Element " + elementToRemove + " does not exist in the array.");
        }

        // hiển thị mảng sau khi xóa phần tử
        System.out.println("Array after removing the element:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}