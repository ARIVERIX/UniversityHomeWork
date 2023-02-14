package SemestrOne.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class Cycles4 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("US"));

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        for (int i = 1; i <= number; i = i + 3 ) {
            System.out.println(i);
        }


    }
}
