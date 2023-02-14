package SemestrTwo.Array;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        int[] number = new int[count];
        for (int i=0; i<count; i++){
            number [i] = scanner.nextInt();
            sum += number[i];
        }
        for (int j = 0; j<count; j++){
            if (j==count - 1) {
                System.out.print(number[j]);
            } else {
                System.out.print(number[j] + " ");
            }
        }
        System.out.println("");
        System.out.print(sum);
    }
}