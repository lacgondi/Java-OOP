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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String valuesToString()
    {
        return "Az x koordináta: "+x+", az y koordináta: "+y;
    }

    public String distanceFromZero()
    {
        int distanceX=x;
        int distanceY=y;

        if(x < 0)
        {
            distanceX *= -1;
        }
        if(y < 0)
        {
            distanceY *= -1;
        }
        return "Az x koordináta "+distanceX+" egységre van az origótól, az y koordináta "+distanceY+" egységere van az origótól";
    }
    public double distanceToAnotherPoint(pont p2)
    {
        return Math.sqrt(Math.pow((p2.x-x), 2) + Math.pow((p2.y-y),2));
    }
}
