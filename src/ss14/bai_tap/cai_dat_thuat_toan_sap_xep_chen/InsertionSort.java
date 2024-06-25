package ss14.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Mảng ban đầu: ");
        printArray(arr);
        insertSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        printArray(arr);
    }
}
