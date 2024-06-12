package Tuhoc;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
   /*
   bài tập : viết chương trình nhập vào tháng trong năm cho
   biết tháng đó thuộc quý mấy
   gợi ý :
   1 năm có 4 quý , mỗi quý có 3 tháng :
   + quý 1 : tháng 1, 2, 3
   + quý 2 : tháng 4, 5, 6
   + quý 3 : tháng 7, 8, 9
   + quý 4 : tháng 10, 11, 12
    */
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Mời bạn nhập vào 1 tháng: ");
       int thang = sc.nextInt();

       if (thang == 1 || thang == 2 || thang == 3) {
           System.out.println("Tháng " + thang + "thuộc quý 1");
       }
   }
}
