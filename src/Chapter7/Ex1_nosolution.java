package Chapter7;

import java.util.Scanner;

class AgeException extends Exception{

    // public Exception(String message)

    public AgeException(String message) {
        super(message);
    }
}


public class Ex1_nosolution {
    public static void CheckAge(String s) throws AgeException{
        // [0-9]
        // [a-z]
        // [A-Z]
        // [a-zA-Z]
        // [^ab]: except a or b
        String regex = "^[0-9]+$";
        boolean match = s.matches(regex);

        if (!match){
            System.out.println("Format Not Accepted");
        }
        else{
            int temp = Integer.parseInt(s);
            if(temp <0 | temp > 100){
                System.out.println("Value Not Accepted");
            }
        }
    }
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter age: ");
            String s = scanner.nextLine();
            CheckAge(s);
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
