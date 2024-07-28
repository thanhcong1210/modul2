package bai_ly_thuyet.thuat_toan_sap_xep;

public class SelectionSort {
    /*
    Thuật toán sắp xếp chọn là một thuật toán sắp xếp đơn giản
    và dễ hiểu. Ý tưởng chính của thuật toán này là chia mảng
     thành hai phần: phần đã được sắp xếp và phần chưa được
     sắp xếp. Ban đầu, phần đã được sắp xếp là trống và phần
     chưa được sắp xếp là toàn bộ mảng. Thuật toán sẽ tìm phần
     tử nhỏ nhất trong phần chưa được sắp xếp và hoán đổi nó
     với phần tử đầu tiên của phần chưa được sắp xếp
      mảng các số: [29, 10, 14, 37, 13].

Tìm phần tử nhỏ nhất trong mảng [29, 10, 14, 37, 13] là 10 và hoán đổi với 29: [10, 29, 14, 37, 13]
Tìm phần tử nhỏ nhất trong mảng [29, 14, 37, 13] là 13 và hoán đổi với 29: [10, 13, 14, 37, 29]
Tìm phần tử nhỏ nhất trong mảng [14, 37, 29] là 14 và hoán đổi với 14: [10, 13, 14, 37, 29]
Tìm phần tử nhỏ nhất trong mảng [37, 29] là 29 và hoán đổi với 37: [10, 13, 14, 29, 37]
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int MinIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[MinIndex]) {
                    MinIndex = j;
                }
            }
            int temp = arr[MinIndex];
            arr[MinIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
