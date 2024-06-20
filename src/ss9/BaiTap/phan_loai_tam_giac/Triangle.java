package ss9.BaiTap.phan_loai_tam_giac;

public class Triangle {
    public static String checkTriangle(double side1, double side2, double side3) {
        if (isValueTriangle(side1, side2, side3)) {
            if (side1 == side2 && side2 == side3) {
                return "Tam giác đều";
            }else if (side1 == side2 || side2 == side3 || side1 == side3) {
                return "Tam giác cân";
            }else {
                return "Tam giác thường";
            }
        }else {
            return "Không phải là tam giác";
        }
    }
    public static boolean isValueTriangle(double side1, double side2, double side3) {
        return     (side1 + side2 > side3)
                && (side1 + side3 > side2)
                && (side2 + side3 > side1);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
