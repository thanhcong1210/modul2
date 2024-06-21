package ss11.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_Stack;

import java.util.Stack;

public class BracketChecker {
    public static boolean isExpressionValid(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();

                    if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String expression3 = "s * (s – a) * s – b) * (s – c)";
        String expression4 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println("Expression 1: " + isExpressionValid(expression1));
        System.out.println("Expression 2: " + isExpressionValid(expression2));
        System.out.println("Expression 3: " + isExpressionValid(expression3));
        System.out.println("Expression 4: " + isExpressionValid(expression4));
    }
}