package ss13.bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    /* cho chạy vòng for lồng nhau
     * vòng lặp ngoài : nếu chuỗi tăng dần thì thêm kí tự vào trong list
     * vòng lặp trong : kiểm tra chuỗi kí tự này có lớn hơn kí tự cuối hay k nếu có thì thêm vào list
     * rồi mik so sánh nếu list 1 lớn hơn list 2 thì mik gán vào max */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character c : max) {
            System.out.print(c);
        }
        System.out.println();
    }
}
