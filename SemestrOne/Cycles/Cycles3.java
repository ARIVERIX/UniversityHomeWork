package SemestrOne.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class Cycles3 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("US"));

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number; i++) {
            int outcome = scanner.nextInt();
            min = Math.min(outcome, min);
        }
        System.out.println(min);
    }
}