package Tuhoc;

import java.util.Scanner;

public class ChoBietThangDoBaoNhieuNgay {
    public static void main(String[] args) {
        /*viết chương trình cho người dùng nhập vào
        1 tháng bất kỳ từ 1 -> 12 => cho biết tháng đó có bao nhiêu ngày
                gợi ý:
        - tháng 1,3,5,7,8,10,12 có 31 ngày
        - tháng 4,6,9,11 có 30 ngày
        - nếu tháng 2 thì yêu cầu nhập thêm năm:
        + nếu năm nhuận thì có 29 ngày
            + nếu năm k nhuận thì có 28 ngày*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 tháng dương lịch: ");
        int thang = sc.nextInt();

        //check điều kiện
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12)
            System.out.println("Tháng " + thang + " có 31 ngày");
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Tháng " + thang + " có 30 ngày");
        } else if (thang == 2) {
            System.out.println("Mời nhập vào năm: ");
            int nam = sc.nextInt();
            if (nam % 4 == 0 && nam % 100!= 0 || nam % 400 == 0)
                System.out.println("Tháng " + thang + "năm" + nam + " có 29 ngày");
            else
                System.out.println("Tháng " + thang + " có 28 ngày");
        }
        else
            System.out.println("Tháng này làm đéo gì có mà nhập");
    }
}
