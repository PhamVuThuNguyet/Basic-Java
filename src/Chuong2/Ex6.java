package Chuong2;

class Rectangle{
    float width, height;

    public void area(){
//        return this.width * this.height;
        System.out.println(this.width * this.height);
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

}

public class Ex6 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0f, 5.0f);
        rectangle.area();
    }
}


