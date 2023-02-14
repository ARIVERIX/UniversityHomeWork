package SemestrOne.CondExpressions;

import java.util.Locale;
import java.util.Scanner;

public class CondExpressions6 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner scanner = new Scanner(System.in);
        String type1 = "Premiere";
        String type2 = "Normal";
        String type3 = "Discount";
        String type = scanner.nextLine();
        if (type.equals(type1)) {
            float r = scanner.nextFloat();
            float c = scanner.nextFloat();
            float rc = (float) (r*c*12.00);
            System.out.printf("%.2f" +" $",rc);
        } else if (type.equals(type2)) {
            float r = scanner.nextFloat();
            float c = scanner.nextFloat();
            float rc = (float) (r*c*7.50);
            System.out.printf("%.2f" +" $",rc);
        } else if (type.equals(type3)) {
            float r = scanner.nextFloat();
            float c = scanner.nextFloat();
            float rc = r*c*5;
            System.out.printf("%.2f" +" $",rc);
        }
    }
}
