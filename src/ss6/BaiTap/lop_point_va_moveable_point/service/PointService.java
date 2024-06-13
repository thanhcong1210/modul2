package ss6.BaiTap.lop_point_va_moveable_point.service;

import ss6.BaiTap.lop_point_va_moveable_point.model.Point;

import java.util.Scanner;

public class PointService {
    private Point point;
    public void add(){
        Scanner scanner = new Scanner(System.in);
        float x;
        float y;
        System.out.println("\n-----Point -----");
        while (true) {
            try {
                System.out.println("Enter x:");
                x = Float.parseFloat(scanner.nextLine());
            }catch (Exception err) {
                System.out.println("\n Error: Could not parse x to number. Please enter agian! \n");
                continue;
            }
            try {
                System.out.println("Enter y:");
                y = Float.parseFloat(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse y to number. \nPlease enter agian!\n");
                continue;
            }
            break;
        }
        point = new Point(x,y);
    }
    public void display(){
        System.out.println(point.toString());
    }
}
