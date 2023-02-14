package SemestrOne.CondExpressions;

import java.util.Locale;
import java.util.Scanner;

public class CondExpressions5 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner scanner = new Scanner(System.in);
        String types1 = "square";
        String types2 = "rectangle";
        String types3 = "circle";
        String types4 = "triangle";
        String type = scanner.nextLine();
        if (type.equals(types1)) {
            float a = scanner.nextFloat();
            System.out.printf("%.3f", a*a);
        } else if (type.equals(types2)) {
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            System.out.printf("%.3f", a*b);
        } else if (type.equals(types3)) {
            float r = scanner.nextFloat();
            System.out.printf("%.3f", Math.PI*r*r);
        } else if (type.equals(types4)) {
            float b = scanner.nextFloat();
            float h = scanner.nextFloat();
            System.out.printf("%.3f", 0.5*b*h);
        }
    }
}
