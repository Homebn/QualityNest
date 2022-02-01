package main.java;



import classes.Point;


public class Main {
    public static double Dest(Point a, Point b) {
        //Расстояние между точками
        double sum2 = (b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y);
        double des = Math.sqrt(sum2);
        return des;
    }

    public static void main(String[] args) {
        Point p = new Point(1, 1);
        Point p1 = new Point(1,1);
        System.out.println(Dest(p, p1));
    }
}


