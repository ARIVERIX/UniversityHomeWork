package SemestrTwo.OOPClasses.Person;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<SemestrTwo.OOPClasses.Person.Person> personList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String[] arrayWords = input.split(" ");
            personList.add(new SemestrTwo.OOPClasses.Person.Person(arrayWords[0], Integer.parseInt(arrayWords[1])));
        }

        // for (int i = 0; i < personList.size(); i++) {
        personList.sort(new Comparator<SemestrTwo.OOPClasses.Person.Person>() {
            @Override
            public int compare(SemestrTwo.OOPClasses.Person.Person men1, SemestrTwo.OOPClasses.Person.Person men2) {
                byte[] arrayO1 = men1.getName().getBytes();
                byte[] arrayO2 = men2.getName().getBytes();
                return arrayO2[0] - arrayO1[0];
            }
        });
        //}

        for (Person people : personList) {
            if (people.getAge() > 30) {
                System.out.println(people.getName() + " - " + people.getAge());
            }
        }
    }
}