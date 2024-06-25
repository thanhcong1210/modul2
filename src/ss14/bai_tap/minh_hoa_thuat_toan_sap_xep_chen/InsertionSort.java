package ss14.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

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
            System.out.println("Chèn key" + arr[j + 1] + "vào vị trí" + (j + 1));
        }
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
