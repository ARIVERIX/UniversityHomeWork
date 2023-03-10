package SemestrTwo.OOPClasses.Parallelepiped;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        try {
            Parallelepiped box = new Parallelepiped(length, width, height);
            System.out.println(box);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
