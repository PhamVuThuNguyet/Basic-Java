package Chapter4;

class Point3D {
    private double x, y, z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double DistanceFrom(Point3D a) {
        return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2)
                + Math.pow(z - a.z, 2));
    }

    public double DistanceFromCenter() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)
                + Math.pow(z, 2));
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

public class Ex1 {


    public static void main(String[] args) {
        Point3D point3D = new Point3D(3, 4, 5);
        Point3D point3D1 = new Point3D(3.5, 4.5, 5);

        System.out.println(point3D.DistanceFromCenter());

        System.out.println(point3D.DistanceFrom(point3D1));

        System.out.println(point3D);
    }
}
