package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        double rsl = Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
        return rsl;
    }

    public double distance3d(Point that) {
        double rsl = Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2)
                + Math.pow((this.z - that.z), 2));
        return rsl;
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
