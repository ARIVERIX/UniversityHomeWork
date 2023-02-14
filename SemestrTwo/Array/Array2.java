package SemestrTwo.Array;
import java.util.Scanner;
public class Array2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputone = scanner.nextLine();
        String inputtwo = scanner.nextLine();
        String[] itemsone = inputone.split(" ");
        String[] itemstwo = inputtwo.split(" ");
        for (int i = 0; i < itemstwo.length-1; i++) {
            for (int j = 0; j < itemsone.length; j++) {
                if (itemstwo[i].equals(itemsone[j])) {
                    System.out.print(itemstwo[i] + " ");
                }
            }
        }
        System.out.print(itemstwo[itemstwo.length - 1]);
    }
}