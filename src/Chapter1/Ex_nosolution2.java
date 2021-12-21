package Chapter1;

import java.util.Scanner;

public class Ex_nosolution2 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str;
        System.out.println("Enter a string: ");
        str = kb.nextLine();
        int len = str.length();
        System.out.println("lenght of string: " + len);
    }
}
