package ss4.BaiTap.XayDungLopQuadraticEquation;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b - 4 * a * c);
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }else {
            double r1 = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
            return r1;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }else {
            double r1 = (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
            return r1;
        }
    }
}

