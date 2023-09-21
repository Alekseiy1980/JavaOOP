package Lessons1;

public class Main {

    public static void main(String[] args) {
        Point2D a = new Point2D(0,2);
//        a.x = 0;
//        a.y = 2;
//        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(0);

        System.out.println(b);
//        System.out.println(distance(a, b));
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
