package SemestrOne.Introduction;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.util.Locale;

public class Introduction6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        double meters = Double.parseDouble(scanner.nextLine());
        double cost = meters * 7.61;
        double a = cost * 0.82;
        double b = cost * 0.18;
        System.out.println("The final price is: " + decimalFormat.format(a) + " $.");
        System.out.println("The discount is: " + decimalFormat.format(b) + " $.");
    }
}