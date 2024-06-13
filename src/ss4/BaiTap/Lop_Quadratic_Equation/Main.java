package ss4.BaiTap.Lop_Quadratic_Equation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Quadratic equation: ax^2 + bx + c = 0");
        while (true) {
            try {
                System.out.print("Enter a, b, c");
                a = Double.parseDouble(scanner.nextLine());
                b = Double.parseDouble(scanner.nextLine());
                c = Double.parseDouble(scanner.nextLine());
            } catch (Exception err) {
                System.out.println("\n Error: Could not parse a or b or c to number. Please enter agian! \n");
                continue;
            }
            break;
        }

        QuadraticEquation qE = new QuadraticEquation(a, b, c);

        System.out.println("Caculate quadratic equation: " + qE.getA() + "x2 +" + qE.getB() + "x + " + qE.getC() + "= 0");

        double discriminant = qE.getDiscriminant();
        System.out.println("Delta = " + qE.getDiscriminant());

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has no solution!");
            }else {
                System.out.println("The equation has a solution: " + (-qE.getC() / (qE.getB())));
            }
        }else {
            if (discriminant < 0) {
                System.out.println("The equation has no solution");
            }else if (discriminant == 0) {
                System.out.println("The equation has a double solution: " + qE.getRoot1());
            }else {
                System.out.println("The equation has two solution: " + qE.getRoot1() + " and " + qE.getRoot2());
            }
        }
    }
}
