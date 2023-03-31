package wgk20202091105lab2;

import org.jetbrains.annotations.NotNull;

import static java.lang.Math.sqrt;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(@NotNull MyPoint other) {
        return sqrt((this.x - other.getX())*(this.x - other.getX()) +(this.y - other.getY())*(this.y - other.getY()));
    }
}
