package ss3.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.print("Element" + (i + 1) + " : ");
        }

        System.out.println("Enter the value to array : ");
        int valueToInsert = scanner.nextInt();

        System.out.print("Enter the position to insert (0-based index): ");
        int positionToInsert = scanner.nextInt();

        if (positionToInsert < 0 || positionToInsert > size) {
            System.out.println("Invalid position! Position should be between 0 and " + size);
            return;
        }

        size++;
        int[] newArray = new int[size];

        for (int i = 0, j = 0; i < size; i++ , j++) {
            if (i == positionToInsert) {
                newArray[i] = valueToInsert;
                j--;
            }else {
                newArray[i] = array[j];
            }
        }
        array = newArray;
        System.out.println("Value" + valueToInsert + "has been inserted at position" + positionToInsert);

        System.out.println("Update array:");
        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + "");
        }
    }
}
