package SemestrOne.CyclesInCycles;

import java.util.Scanner;

public class CyclesInCycles1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int complicated = 0;
        int simple = 0;
        while (!name.equals("stop")) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0) {
                if (isNotSimple(number)) {
                    complicated += number;
                } else {
                    simple += number;
                }
            } else{
                System.out.println("Number is negative");
            }
            name = scanner.nextLine();
        } System.out.printf("%s: %x\n","Sum of all prime numbers is",simple);
        System.out.printf("%s: %x","Sum of all non prime numbers is",complicated);
    } public static boolean isNotSimple(int letter) {
        if (letter == 1)
            return false;
        for (int i = 2; i * i <= letter; i++) {
            if (letter % i == 0)
                return false;
        } return true;
    }
}