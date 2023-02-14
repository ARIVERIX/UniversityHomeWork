package SemestrOne.Introduction;

import java.util.Locale;
import java.util.Scanner;

public class Introduction4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * (radius * radius);
        System.out.printf(Locale.ENGLISH,"%.2f \n", + area);
        double circumference= Math.PI * 2*radius;
        System.out.printf(Locale.ENGLISH,"%.2f", + circumference);
    }
}