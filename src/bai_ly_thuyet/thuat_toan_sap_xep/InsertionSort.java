package bai_ly_thuyet.thuat_toan_sap_xep;

public class InsertionSort {
    /*
    Thuật toán sắp xếp chèn là một thuật toán sắp xếp
    đơn giản và hiệu quả, đặc biệt là với các mảng nhỏ
    hoặc gần như đã được sắp xếp
    mảng các số: [5, 2, 9, 1, 7]
    Bắt đầu với phần tử đầu tiên [5], coi như đã được sắp xếp.
Chèn 2 vào vị trí thích hợp trong [5] để được [2, 5].
Chèn 9 vào vị trí thích hợp trong [2, 5] để được [2, 5, 9].
Chèn 1 vào vị trí thích hợp trong [2, 5, 9] để được [1, 2, 5, 9].
Chèn 7 vào vị trí thích hợp trong [1, 2, 5, 9] để được [1, 2, 5, 7, 9].
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
