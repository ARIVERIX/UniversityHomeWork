package SemestrTwo.Array;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String types = scanner.nextLine();
        int count = scanner.nextInt();
        String[] numbers = types.split(" ");
        for (int i=0; i<count; i++){
            String Number = numbers[0];
            for (int j=0; j< numbers.length-1; j++){
                numbers[j] = numbers[j+1];
            }
            numbers[numbers.length-1] = Number;
        }
        for (int k=0; k<numbers.length; k++){
            if (k==numbers.length-1){
                System.out.print(numbers[k]);
            } else {
                System.out.print(numbers[k]+" ");
            }
        }
    }
}