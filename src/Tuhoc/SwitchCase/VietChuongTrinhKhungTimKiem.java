package Tuhoc.SwitchCase;

import java.util.Scanner;

public class VietChuongTrinhKhungTimKiem {
    /*
    viết chương trình khung tìm kiếm : cho người dùng nhập vào lựa chọn
    1. tìm theo tên
    2. tìm theo tác giả
    3. tìm theo nhà xuất bản
    4. tìm theo tiêu đề
    thoát nếu phím bấm không hợp lệ
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bấm phím để chọn: ");
        System.out.println("Bấm 1: Tìm theo tên ");
        System.out.println("Bấm 2: Tìm theo tác giả ");
        System.out.println("Bấm 3: Tìm nhà xuất bản ");
        System.out.println("Bấm 4: Tìm theo tiêu đề ");
        int so = sc.nextInt();
        switch (so) {
            case 1:
                System.out.println("Tìm theo tên ");
                break;
            case 2:
                System.out.println("Tìm theo tác giả ");
                break;
            case 3:
                System.out.println("Tìm nhà xuất bản ");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề ");
                break;
            default:
                System.out.println("Không hợp lệ ");
                break;
        }
    }
}
