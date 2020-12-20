package main;

import static java.lang.Math.sqrt;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getPositionBetweenTwoPoints(Position other) {
        double x = Math.pow((this.x-other.getX()), 2);
        double y = Math.pow((this.y-other.getY()), 2);
        return (int)sqrt(x+y);
    }
}
