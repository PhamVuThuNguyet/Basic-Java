package Chapter2;
import java.lang.Math;

class Cube {
    float number;

    public float cubeVolume(){
        return (float) Math.pow(this.number, 3.0f);
    }

    public Cube(float number) {
        this.number = number;
    }
}


public class Ex7 {
    public static void main(String[] args) {
      //  Cube cube = new Cube(2.0f);
        //System.out.println(cube.cubeVolume());
    }
}
