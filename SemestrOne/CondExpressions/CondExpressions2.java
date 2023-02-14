package SemestrOne.CondExpressions;

import java.util.Locale;
import java.util.Scanner;

public class CondExpressions2 {
    public static void main(String[] args) {
         Locale.setDefault(new Locale("US"));
        Scanner scanner = new Scanner(System.in);
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int sum3 = scanner.nextInt();
        int totalSec = (sum1+sum2+sum3);
        String totalTime = "";
        if ((totalSec % 60)< 10) {
            totalTime = Integer.toString(totalSec / 60) + ":0" + Integer.toString(totalSec % 60);
        } else {
            totalTime = Integer.toString(totalSec/60) + ":" + Integer.toString(totalSec % 60);
        }
        System.out.printf(totalTime);
    }
}
