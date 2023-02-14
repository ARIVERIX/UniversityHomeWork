package SemestrTwo.Array;
import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String types = scanner.nextLine();
        String[] array = types.split(" ");
        int[] numbers = new int[array.length];
        for (int i=0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
        }
        for (int n=0; n<numbers.length-1; n++){
            int number = numbers[n];
            int sum = n;
            for (int k=n+1; k<numbers.length; k++){
                if(number>numbers[k]){
                    sum+=1;
                }
            }
            if(sum==numbers.length-1){
                System.out.print(numbers[n] + " ");
            }
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}


