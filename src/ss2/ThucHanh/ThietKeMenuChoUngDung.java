package ss2.ThucHanh;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("0. Exit");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Update");
            System.out.println("Enter your choice: ");
            while (true){
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Add");
                        System.out.println("******");
                        System.out.println("*****");
                        System.out.println("****");
                        System.out.println("***");
                        System.out.println("**");
                        System.out.println("*");
                        break;
                    case 2:
                        System.out.println("Remove");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                    case 3:
                        System.out.println("Update");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("No choice!");
                        break;
                }
            }

        }
}
