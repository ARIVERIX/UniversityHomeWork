package SemestrOne.CondExpressions;

import java.util.Scanner;

public class CondExpressions1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a == b && b == c && a == c) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}