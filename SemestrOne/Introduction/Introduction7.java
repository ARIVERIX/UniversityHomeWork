package SemestrOne.Introduction;

import java.util.Locale;
import java.util.Scanner;

public class Introduction7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double a = Math.abs(x1-x2);
        double b =  Math.abs(y1-y2);
        double c = a + b;
        double d = a * b;
        double s = 2 * c;
        System.out.printf(Locale.ENGLISH,"%.2f \n",d);
        System.out.printf(Locale.ENGLISH,"%.2f",s);
    }
}
