package SemestrOne.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class Cycles2 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("US"));

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number; i++) {
            int outcome = scanner.nextInt();
            max = Math.max(outcome, max);
        }
        System.out.println(max);
    }
}



