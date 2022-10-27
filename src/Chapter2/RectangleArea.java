package Chapter2;

class Rectangle {
    public double width;
    public double height;

    public Rectangle() {

    }

    public Rectangle(double x, double y) {
        width = x;
        height = y;
    }

    public double area() {
        return width * height;
    }

    public void area_void() {
        System.out.println(width * height);
    }
}


public class RectangleArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 10);
        rectangle.area_void();
    }
}
