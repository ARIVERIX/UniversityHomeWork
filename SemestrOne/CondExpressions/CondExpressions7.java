package SemestrOne.CondExpressions;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CondExpressions7 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner scanner = new Scanner(System.in);
        var days1 = new ArrayList<String>();
        days1.add("Monday");
        days1.add("Tuesday");
        days1.add("Wednesday");
        days1.add("Thursday");
        days1.add("Friday");
        var days2 = new ArrayList<String>();
        days2.add("Saturday");
        days2.add("Sunday");
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        float mass = scanner.nextFloat();
        if (fruit.equals("banana")) {
            if (days1.contains(day)) {
                System.out.printf("%.2f", mass * 2.50);
            } else if (days2.contains(day)) {
                System.out.printf("%.2f", mass * 2.70);
            }
        }
        if (fruit.equals("apple")) {
            if (days1.contains(day)) {
                System.out.printf("%.2f",mass * 1.20);
            } else if (days2.contains(day)) {
                System.out.printf("%.2f",mass * 1.25);
            }
        }
        if (fruit.equals("orange")) {
            if (days1.contains(day)) {
                System.out.printf("%.2f",mass * 0.85);
            } else if (days2.contains(day)) {
                System.out.printf("%.2f",mass * 0.90);
            }
        }
        if (fruit.equals("grapefruit")) {
            if (days1.contains(day)) {
                System.out.printf("%.2f", mass * 1.45);
            } else if (days2.contains(day)) {
                System.out.printf("%.2f", mass * 1.60);
            }
        }
        if (fruit.equals("kiwi")) {
            if (days1.contains(day)) {
                System.out.printf("%.2f", mass * 2.70);
            } else if (days2.contains(day)) {
                System.out.printf("%.2f",mass * 3.00);
            }
        }
        if (fruit.equals("pineapple")) {
            if (days1.contains(day)) {
                System.out.printf("%.2f", mass * 5.50);
            } else if (days2.contains(day)) {
                System.out.printf("%.2f",mass * 5.60);
            }
        }
        if (fruit.equals("grapes")) {
            if (days1.contains(day)) {
                System.out.printf("%.2f", mass * 3.85);
            } else if (days2.contains(day)) {
                System.out.printf("%.2f", mass * 4.20);
            }
        }
    }
}

