package SemestrTwo.ArrayTwo;

import java.util.Scanner;

public class TwoArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = " ";
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if(i < j) {
                    array[j][i] = array[i][j];
                }
                numbers += (array[i][j] + " ");
            }
            System.out.println(numbers.trim());
            numbers = " ";
        }
    }
}