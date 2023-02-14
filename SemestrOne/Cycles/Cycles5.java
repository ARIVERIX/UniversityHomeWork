package SemestrOne.Cycles;

import java.util.Scanner;

    public class Cycles5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String title = scanner.nextLine();

            int score = scanner.nextInt();
            int number = 0;
            int flag = 0;
            for (int i = 0; i < score; i++) {
                String namebook = scanner.nextLine();
                if (title.equals(namebook)) {
                    flag = 1;
                    break;
                } else {
                    number += 1;
                }
            }
            if (flag == 1) {
                System.out.printf("You checked %d books and found it.", number - 1);
            } else {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", number);
            }
        }
    }
