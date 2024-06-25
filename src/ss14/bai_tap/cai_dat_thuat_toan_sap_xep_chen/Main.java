package ss14.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import static ss14.bai_tap.cai_dat_thuat_toan_sap_xep_chen.InsertionSort.insertSort;
import static ss14.bai_tap.cai_dat_thuat_toan_sap_xep_chen.InsertionSort.printArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Mảng ban đầu: ");
        printArray(arr);
        insertSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        printArray(arr);
    }
}
