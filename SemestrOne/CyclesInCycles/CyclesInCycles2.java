package SemestrOne.CyclesInCycles;

import java.util.Scanner;

public class CyclesInCycles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        while(!name.equals("End")) {
            int nubmer = scanner.nextInt();
            int total = 0;
            while (total < nubmer) {
                int dollars = scanner.nextInt();
                total = total + dollars;
            } System.out.printf("Going to %s!",name);
            System.out.println();
            name = scanner.next();
        }
    }
}
