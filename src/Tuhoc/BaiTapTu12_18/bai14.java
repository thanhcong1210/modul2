package Tuhoc.BaiTapTu12_18;

public class bai14 {
    /*
    viết chương trình tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím
    - nhập n = 7, bỏ qua không cộng tổng với số 3 => in ra kết quả
        ( gợi ý đáp án : 1+5+7=13)
    - thử break khi vòng lặp chạy đến giá trị n=3
     */
    public static void main(String[] args) {
        int n;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập n : ");
        n = sc.nextInt();
        if (n % 2 != 0){
            for (int i = 1; i <= n; i+=2) {
                if (i == 3)
                    continue;
                else
                    tong += i;
            }
            System.out.println("tổng các số lẻ từ 1 đến " + n + " = " + tong);
        }
    }
}
