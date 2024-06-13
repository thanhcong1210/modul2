package Tuhoc.While;

public class WhileTrue {
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            n++;
            System.out.println("n = " + n);
            if (n == 10)
                break;
        }
    }
}
