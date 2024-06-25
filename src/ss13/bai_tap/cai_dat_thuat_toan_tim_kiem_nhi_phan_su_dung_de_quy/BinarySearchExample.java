package ss13.bai_tap.cai_dat_thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 1, 7};
        Arrays.sort(arr);
        int value = 7;
        int index = binarySearch(arr, 0, arr.length - 1, value);
        if (index != -1) {
            System.out.println("The value " + value + "if found at index " + index);
        }else {
            System.out.println("The value " + value + "is not found in the array");
        }
    }
    private static int binarySearch(int[] array, int left, int right, int value){
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (array[mid] == value) {
            return mid;
        } else if (array[mid] > value) {
            return binarySearch(array, left, mid - 1, value);
        } else {
            return binarySearch(array, mid + 1, right, value);
        }
    }
}
