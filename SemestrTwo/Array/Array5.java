package SemestrTwo.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j>i; j--) {
                if (number == array[i] + array[j]) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
    }
}
