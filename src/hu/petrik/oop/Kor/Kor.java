package hu.petrik.oop.Kor;

public class Kor {
    private int x;
    private int y;
    private double r;

    public Kor(int x, int y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Kor(double r) {
        this.r = r;
        x = 0;
        y = 0;
    }

    public double circumference()
    {
        return r*2*Math.PI;
    }

    public double area()
    {
        return Math.pow(r,2)*Math.PI;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String data()
    {
        return x+", "+y+", "+r;
    }
}
