package Chuong1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        int a;
        int b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number a: ");
        a = keyboard.nextInt();
        System.out.println("Enter number b: ");
        b = keyboard.nextInt();
        int plus = a + b;
        int minus = a - b;
        int mul = a * b;
        float divide = a / b;
        float remainer = a % b;

        System.out.println(a + " + " + b + " = " + plus);
        System.out.println(a + " - " + b + " = " + minus);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + divide);
        System.out.println(a + " % " + b + " = " + remainer);
    }
}
