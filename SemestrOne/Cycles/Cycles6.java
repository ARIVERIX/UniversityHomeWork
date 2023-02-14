package SemestrOne.Cycles;

import java.util.Scanner;

public class Cycles6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int name = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < name; i++) {
            int pair = Integer.parseInt(scanner.nextLine());
            int pairnum = Integer.parseInt(scanner.nextLine());
            int sum = pair + pairnum;
            max = Math.max(sum,max);
            min = Math.min(sum,min);
        } if (max != min)
        { int total = Math.abs(max-min);
            System.out.printf("No, maxdiff=%s",total);
        } else {
            System.out.printf("Yes, value=%s", max);
        }
    }
}