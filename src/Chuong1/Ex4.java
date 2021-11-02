package Chuong1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        char ch;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a character: ");
        ch = keyboard.next().charAt(0);
        System.out.println("byte: " + (byte)ch);
    }
}
