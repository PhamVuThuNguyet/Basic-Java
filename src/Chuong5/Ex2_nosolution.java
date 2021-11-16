package Chuong5;

import java.awt.Color;
import java.util.Scanner;

class Point2D{
    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Circle2D{
    private double radius;
    private Color color;
    private Point2D center;

    public Circle2D(double radius, Color color, Point2D center) {
        this.radius = radius;
        this.color = color;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public void printInfo(){
        System.out.println("radius: " + this.radius + "; color: " + this.color +
                " center: (" + this.center.getX() + ", " + this.center.getY() + ")");
    }
}


public class Ex2_nosolution {
    public Ex2_nosolution() {
    }

    public Color inputColor(){
        float r, g, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input r: ");
        r = scanner.nextFloat();
        System.out.println("input g: ");
        g = scanner.nextFloat();
        System.out.println("input b: ");
        b = scanner.nextFloat();
        System.out.println(r + " " + g + " " + b);
        return new Color(r / 255 , g / 255, b / 255);
    }

    public static void main(String[] args) {
        Ex2_nosolution ex2_nosolution = new Ex2_nosolution();
        Color color = ex2_nosolution.inputColor();
        Point2D point2D = new Point2D(10, 10);
        Circle2D circle2D = new Circle2D(5.5, color, point2D);
        circle2D.printInfo();
    }
}
