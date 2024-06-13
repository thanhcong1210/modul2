package Tuhoc.ToanTu3Ngoi;

import java.util.Scanner;

public class DiemTrungBinh {
    /*
    viết chương trình nhập vào điểm trung bình và kết quả
    xếp loại của học sinh theo tiêu chuẩn sau : ( dùng toán tử 3 ngôi )
    giỏi : nếu điểm >= 8
    khá : nếu điểm >= 6.5 và < 8
    trung bình : nếu điểm >= 5 và < 6.5
    yếu : nếu điểm < 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dtb = sc.nextDouble();

        String traloi = (dtb > 8) ? "giỏi" :
                ((dtb < 8 && dtb >= 6.5) ? "khá" :
                        (dtb < 6.5 && dtb >= 5) ? "Trung bình;" : "Yếu");
        System.out.println(traloi);
    }
}
