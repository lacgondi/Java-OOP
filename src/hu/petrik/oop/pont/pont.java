package hu.petrik.oop.pont;

import java.util.Random;

public class pont {
    private int x;
    private int y;

    public pont() {
        this.x = 0;
        this.y = 0;
    }

    public pont(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public pont(int n)
    {
        Random rand = new Random();
        this.x= rand.ints(n*-1, n).findFirst().getAsInt();
        this.y= rand.ints(n*-1, n).findFirst().getAsInt();
    }

    public
}
