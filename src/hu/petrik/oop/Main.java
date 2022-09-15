package hu.petrik.oop;

import hu.petrik.oop.Kor.Kor;
import hu.petrik.oop.pont.pont;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //Pont class
        pont p1 = new pont();
        pont p2 = new pont(0,2);
        pont p3 = new pont(3,5);
        System.out.println(p1.valuesToString());
        System.out.println(p2.valuesToString());
        System.out.println(p3.valuesToString());
        System.out.println(p2.distanceFromZero());
        System.out.println(p2.distanceToAnotherPoint(p3));

        //Kor Class
        Kor k1 = new Kor(3,4,2);
        Kor k2 = new Kor(52);
        Kor k3 = new Kor(4);
        Kor k4 = new Kor(22);
        Kor k5 = new Kor(12);
        Kor k6 = new Kor(8);
        Kor k7 = new Kor(42);
        Kor k8 = new Kor(11);
        Kor k9 = new Kor(65);
        Kor k10 = new Kor(77);
        System.out.println(k1.circumference());
        System.out.println(k2.area());
        System.out.println(k3.data());
        System.out.println(k4.data());
        System.out.println(k5.data());
        System.out.println(k6.data());
        System.out.println(k7.data());
        System.out.println(k8.data());
        System.out.println(k9.data());
        System.out.println(k10.data());


    }
}
