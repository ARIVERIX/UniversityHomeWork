package SemestrOne.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class Cycles1 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        while (true) {
            if ((a < 300 && a > -300) || (a > 1000 && a < 1600)) {
                System.out.println("The number is: " + a);
                break;

            }  else if ((a > 300 || a < -300) || (a < 1000 || 1600 < a)) {
                System.out.println("Invalid number!");
                break;
            }
        }
    }
}