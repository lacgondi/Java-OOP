package hu.petrik.oop;

import hu.petrik.oop.pont.pont;

public class Main {
    public static void main(String[] args) {
        pont p1 = new pont();
        pont p2 = new pont(0,2);
        pont p3 = new pont(3,5);

        System.out.println(p1.valuesToString());
        System.out.println(p2.valuesToString());
        System.out.println(p3.valuesToString());
        System.out.println(p2.distanceFromZero());
        System.out.println(p2.distanceToAnotherPoint(p3));
    }
}
