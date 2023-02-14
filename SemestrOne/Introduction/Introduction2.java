package SemestrOne.Introduction;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.util.Locale;

public class Introduction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        double b = a/65;
        double c = (Math.floor(100*b)/100);
        System.out.println(decimalFormat.format(c));
    }
}