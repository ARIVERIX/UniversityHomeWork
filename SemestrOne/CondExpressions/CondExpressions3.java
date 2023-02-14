package SemestrOne.CondExpressions;

import java.util.Scanner;

public class CondExpressions3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());

        if (a <= 10) {
            System.out.println("медленно");
        }
             else if (a >= 10 && a <= 50) {
             System.out.println("средняя");
        }
             else  if(a >= 50 && a <= 150) {
             System.out.println("быстро");
        }
             else if(a >= 150 && a <= 1000) {
             System.out.println("ультрабыстро");
        }
             else if(a >= 1000) {
             System.out.println("невероятно быстро");
        }

    }
}
