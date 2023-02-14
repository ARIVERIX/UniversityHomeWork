package SemestrOne.Introduction;

import java.util.Scanner;
import java.util.Locale;

public class Introduction5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = a * 221.49f + b * 312.99f;
        System.out.printf("%.2f" + " rub.",c);
    }
}