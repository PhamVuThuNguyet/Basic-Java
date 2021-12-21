package Chapter7;

import java.util.Scanner;

class UnsignedIntegerException extends Exception{
    public UnsignedIntegerException(String message) {
        super(message);
    }
}

public class Ex3 {

    public static void CheckNumber(String s) throws UnsignedIntegerException{
        // Regular expression
        // ^: start
        // $: end
        // \d: 0 - 9
        // 0, 10, 11111, 123456789
        // \d+: 1...n
        // \d*: 0...n
        // \d?: 0...1

        String regex = "^\\d+$";

        boolean match = s.matches(regex);


        if (!match){
            throw new UnsignedIntegerException("Format Not Accepted");
        }
    }

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a positive integer: ");
            String s = scanner.nextLine();
            CheckNumber(s);
        }catch(UnsignedIntegerException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
