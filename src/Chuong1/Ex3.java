package Chuong1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        byte N;
        System.out.println("Enter a byte: ");
        N = keyboard.nextByte();
        System.out.println("character" + (char)N);
    }
}
