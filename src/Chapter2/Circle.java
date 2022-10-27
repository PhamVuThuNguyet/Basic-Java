package Chapter2;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI * Math.pow(this.radius,2));
    }

}
