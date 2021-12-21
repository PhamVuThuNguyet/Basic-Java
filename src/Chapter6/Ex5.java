package Chapter6;

interface Vehicle{
    // abstract method
    public void speedUp(float v);
    public void speedDown(float v);
    public void break_();
}

class Motor implements Vehicle{
    private float speed;

    public Motor() {
    }

    public Motor(float speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp(float v) {
        this.speed += v;
    }

    @Override
    public void speedDown(float v) {
        this.speed -= v;
    }

    @Override
    public void break_() {
        this.speed = 0;
    }

    public String toString(){
        return ("Speed: " + this.speed);
    }

}

class Car implements Vehicle{
    private float speed;

    public Car() {
    }

    public Car(float speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp(float v) {
        this.speed *= v;
    }

    @Override
    public void speedDown(float v) {
        this.speed /= v;
    }

    @Override
    public void break_() {
        this.speed = 0;
    }

    public String toString(){
        return ("Speed car: " + this.speed);
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Motor motor = new Motor(30);
        motor.speedUp(15);
        System.out.println(motor.toString());

        Car car = new Car(10);
        car.speedUp(2.5f);
        System.out.println(car);
    }
}


