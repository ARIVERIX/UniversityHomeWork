package SemestrTwo.ArrayTwo;

import java.util.Scanner;

public class TwoArray4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++){
                int numbers = scanner.nextInt();
                matrix[i][j] = numbers;
            }
        }
        int summ = matrix[0][0] * matrix[1][1];
        int summs = matrix[1][0] * matrix[0][1];
        int summnation = summ - summs;
        System.out.print(summnation);
    }
}

//        for(int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix.length; j++) {
//        System.out.print(matrix[i][j] + " ");
//        }