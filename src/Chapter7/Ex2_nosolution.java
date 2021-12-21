package Chapter7;

import java.util.Scanner;

class PINException extends Exception{
    public PINException(String message) {
        super(message);
    }
}


public class Ex2_nosolution {
    public static void PINCheck(String s) throws PINException{
        // define regex

        String regex = "^[0-9]{4}$";
        boolean match = s.matches(regex);
        if(!match){
            System.out.println("PIN Not Accepted");
        }
    }
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter PIN: ");
            String s = scanner.nextLine();
            PINCheck(s);
        }catch(PINException e){
            System.out.println(e.getMessage());
        }
    }
}
