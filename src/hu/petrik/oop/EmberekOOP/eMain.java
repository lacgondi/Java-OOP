package hu.petrik.oop.EmberekOOP;

public class eMain {
    public static void main(String[] args) {
        Ember e1 = new Ember("Kiss Jóska", "2020.02.02", "Budapest");
        Ember e2 = new Ember("Kovács Balázs", "1990.03.02", "New York");
        Ember e3 = new Ember("Kiss László", "1989.04.04", "Paris");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
    }
}
