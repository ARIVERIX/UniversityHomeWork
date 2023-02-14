package SemestrOne.Introduction;

import java.util.Locale;
import java.util.Scanner;

public class Introduction3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = a*2.54;
        System.out.printf(Locale.ENGLISH,"%.2f",b);
    }
}
