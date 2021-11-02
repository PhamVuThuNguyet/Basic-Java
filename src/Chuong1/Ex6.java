package Chuong1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        float radius;
        final float pi = 3.14f;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the circle radius: ");
        radius = keyboard.nextFloat();
        float area =  radius * radius * pi;
        float perimeter = 2 * radius * pi;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
