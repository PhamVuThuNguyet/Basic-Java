package Chapter3;

public class Ex14 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= 2 - i; j++){
                System.out.print("  ");
            }
            for(int k = 0; k <= 2 * i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
