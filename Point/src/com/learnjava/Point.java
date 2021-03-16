package com.learnjava;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return calculateDistance(getX(), getY(), 0, 0);
    }

    public double distance(int x, int y) {
        return calculateDistance(getX(), getY(), x, y);
    }

    public double distance(Point p) {
        return calculateDistance(getX(), getY(), p.getX(), p.getY());
    }

    public double calculateDistance(int xA, int yA, int xB, int yB) {
        int xDiff = xB - xA;
        int yDiff = yB - yA;
        return Math.sqrt((xDiff*xDiff) + (yDiff*yDiff));
    }
}
