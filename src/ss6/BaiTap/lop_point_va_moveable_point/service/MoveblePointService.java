package ss6.BaiTap.lop_point_va_moveable_point.service;

import ss6.BaiTap.lop_point_va_moveable_point.model.MoveablePoint;

import java.util.Scanner;

public class MoveblePointService {

    private MoveablePoint moveablePoint;

    public void add(){
        Scanner scanner = new Scanner(System.in);
        float x;
        float y;
        float xSpeed;
        float ySpeed;
        System.out.println("\n-----MoveablePoint-----");
        while (true){
            try{
                System.out.println("Ebter x:");
                x = Float.parseFloat(scanner.nextLine());
            }catch (Exception err) {
                System.out.println("\nError: Could not parse x to number. \nPlease enter again!\n");
                continue;
            }
            try {
                System.out.println("Enter y :");
                y = Float.parseFloat(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse y to number. \nPlease enter again!\n");
                continue;
            }
            try {
                System.out.println("Enter xSpeed:");
                xSpeed = Float.parseFloat(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\nError: Could not parse xSpeed to number. \nPlease enter again!\n");
                continue;
            }
            try {
                System.out.println("Enter ySpeed:");
                ySpeed = Float.parseFloat(scanner.nextLine());
            }catch (Exception err) {
                System.out.println("\nError: Could not parse ySpeed to number. \nPlease enter again");
                continue;
            }
            break;
        }
        moveablePoint = new MoveablePoint(x, y, xSpeed, ySpeed);
    }
    public void display(){
        System.out.println(moveablePoint.toString());
    }
    public void move(){
        MoveablePoint temp = moveablePoint.move();
        System.out.println(temp.toString());
    }
}
