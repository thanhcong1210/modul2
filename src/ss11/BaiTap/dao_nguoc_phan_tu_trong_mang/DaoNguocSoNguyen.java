package ss11.BaiTap.dao_nguoc_phan_tu_trong_mang;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = getValidLength(scanner);

        int[] arr = new int[length];
        for (int index = 0; index < length; index++) {
            arr[index] = getValidElement(scanner, index);
        }

        Stack<Integer> stack = new Stack<>();

        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + "\t");
            stack.push(arr[i]);
        }

        System.out.println("\nMảng sau khi đảo ngược: ");
        for (int i = 0; i < length; i++) {
            System.out.print(stack.pop() + "\t");
        }
    }

    private static int getValidLength(Scanner scanner) {
        int length = -1;
        while (true) {
            System.out.println("Nhập số lượng phần tử:");
            String input = scanner.nextLine();
            if (isNumeric(input)) {
                length = Integer.parseInt(input);
                if (length > 0) {
                    break;
                } else {
                    System.out.println("Lỗi: Độ dài không hợp lệ, hãy thử lại");
                }
            } else {
                System.out.println("\nLỗi: Không thể phân tích độ dài thành số, hãy thử lại.\n");
            }
        }
        return length;
    }

    private static int getValidElement(Scanner scanner, int index) {
        int element = -1;
        while (true) {
            System.out.println("Nhap phan tu thu " + (index + 1) + ":");
            String input = scanner.nextLine();
            if (isNumeric(input)) {
                element = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Error: Could not parse element " + (index + 1) + " to number, try again.");
            }
        }
        return element;
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }
}
