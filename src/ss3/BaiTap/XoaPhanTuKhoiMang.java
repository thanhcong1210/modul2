package ss3.BaiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        int position = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToRemove) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            for (int i = position; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            size--;
            System.out.println("Element " + elementToRemove + " has been removed from the array.");
        } else {
            System.out.println("Element " + elementToRemove + " does not exist in the array.");
        }

        System.out.println("Array after removing the element:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}