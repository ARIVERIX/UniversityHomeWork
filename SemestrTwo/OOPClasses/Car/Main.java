package SemestrTwo.OOPClasses.Car;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        ArrayList<Car> arrayList = new ArrayList<>();

        for (int i = 0; i < counter; i++) {
            Scanner scanner1 = new Scanner(System.in);
            String numbers = scanner1.nextLine();
            String[] array = numbers.split(" ");

            Car car = new Car();
            car.setMake(array[0]);
            car.setModel(array[1]);
            car.setHorsePower(Integer.parseInt(array[2]));
            arrayList.add(car);
        }

        for (Car a : arrayList) {
            System.out.println(a.getInfo());
        }
    }
}