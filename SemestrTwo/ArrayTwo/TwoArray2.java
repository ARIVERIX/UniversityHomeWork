package SemestrTwo.ArrayTwo;

import java.util.Scanner;

public class TwoArray2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[][] mass = new int [number][3];
        int summary = 0;
        for (int i = 0; i < number; i++) {
            String [] count = scanner.nextLine().split(" ");
            mass[i][0] = Integer.parseInt(count[0]);                                                                       //номер поезда
            mass[i][1] = Integer.parseInt(count[1]);                                                                       //кол-во вагонов
            mass[i][2] = Integer.parseInt(count[2]);                                                                       //кол-во пассажиров
        }
        int train = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++){                                                                                  //Сравниваем номера поездов
            if(mass[i][0] == train) {
                summary += mass[i][2];
            }
        }
        int str = 0;                                                                                                       //Суммирование пассажиров
        for(int i = 0; i < number; i++) {
            if(train != mass[i][0]) {
                str++;
            }
        }
        if (str != number) {
            System.out.println(summary);
        } else {
            System.out.println("Error");
        }
    }
}
