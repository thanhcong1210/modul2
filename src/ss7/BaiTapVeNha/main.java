package ss7.BaiTapVeNha;

import ss7.BaiTapVeNha.staff.OfficeStaff;
import ss7.BaiTapVeNha.staff.Staff;
import ss7.BaiTapVeNha.staff_mananger.StaffMananger;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();
        StaffMananger manager = new StaffMananger(limit);
        Staff staff1 = new OfficeStaff(1, "CONG", "0210394581", "Chu tich");
        Staff staff2 = new OfficeStaff(2, "VU", "20144204941", "Giam Doc");
        manager.add(staff1);
        manager.add(staff2);

        while (true) {
            System.out.println("Menu Staff Manager");
            System.out.println("1. Add Staff");
            System.out.println("2. Update staff");
            System.out.println("3. Remove Staff");
            System.out.println("4. Display staff");
            System.out.println("0. Exit");
            System.out.print("Choice Function Of You: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: boolean continueAdd = true;
                    while (continueAdd) {
                        System.out.println("1. Office Staff");
                        System.out.println("2. Factory Staff");
                        System.out.println("3. Shipper");
                        System.out.println("0. Exit");
                        System.out.print("Choice Type Of Staff:  ");
                        int choiceAdd = scanner.nextInt();
                        switch (choiceAdd) {

                        }
                    }
        }
    }
}
