package SemestrOne.CondExpressions;

import java.util.Scanner;

public class CondExpressions4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());

        if (a < 100) {
            System.out.println("Меньше чем 100");
        }
        else if (a > 100 && a < 200) {
            System.out.println("Между 100 и 200");
        }
        else if (a > 200) {
            System.out.println("Больше чем 200");
        }
    }
}
