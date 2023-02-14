package SemestrTwo.OOP_Inheritance.Hero;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Pusik", 10, 13, 5);
        System.out.println(wizard.action());
        System.out.println(wizard.action());
        System.out.println(wizard.action());
        System.out.println(wizard.action());
    }
}