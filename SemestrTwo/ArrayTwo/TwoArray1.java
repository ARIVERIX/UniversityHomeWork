package SemestrTwo.ArrayTwo;

import java.util.Scanner;
public class TwoArray1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int[][] mas = new int[n][m];
        String mass = scanner.nextLine();
        String[] numbers = (mass.split(" "));
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                if (i==0){
                    mas[i][j]=Integer.parseInt(numbers[j]);
                } else {
                    mas[i][j]=Integer.parseInt(numbers[j+(numbers.length/m)]);
                }
            }
        }
        int min = mas[0][0];
        for(int b = 0; b < n; b++){
            for(int p = 0; p < m;p++){
                if (min > mas[b][p]) {
                    min = mas[b][p];
                }
            }
        }
        for(int y = 0; y < n; y++){
            for(int t = 0; t < m - 1; t++){
                System.out.print(mas[y][t] + " ");
            }
            System.out.print(mas[y][m - 1]);
            System.out.print("\n");
        }
        System.out.println(min);
    }
}