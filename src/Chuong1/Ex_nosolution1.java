package Chuong1;

import java.util.Scanner;

public class Ex_nosolution1 {
    public static void main(String[] args){
        double n;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a double number: ");
        n = keyboard.nextDouble();

        double sin = Math.sin(Math.toRadians(90));
        double cos = Math.cos(n);
        double sqrt = Math.sqrt(n);

        System.out.println("sin" + sin);
        System.out.println("cos" + cos);
        System.out.println("Squared root" + sqrt);

    }
}
