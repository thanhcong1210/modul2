package bai_ly_thuyet.thuat_toan_sap_xep;

public class BubbleSort {
    /*
    thuật toán sắp xếp nổi bọt là 1 trong những thuật toán sắp
    xếp đơn giản và dễ hiểu. Ý tưởng chính của thuật toán này là
    lặp đi lặp lại việc so sánh từng cặp phần tử liền kề trong 1
    danh sách và hoán đổi vị trí của chúng nếu chúng 0 theo thứ
    tự đúng
    danh sách các số: [5, 2, 9, 1, 7].

Lần lặp 1: [2, 5, 1, 7, 9] (hoán đổi 5 và 2)
Lần lặp 2: [2, 1, 5, 7, 9] (hoán đổi 5 và 1)
Lần lặp 3: [1, 2, 5, 7, 9] (hoán đổi 2 và 1)
Lần lặp 4: [1, 2, 5, 7, 9] (không cần hoán đổi)
Sau 4 lần lặp, danh sách đã được sắp xếp hoàn toàn.
     */

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

