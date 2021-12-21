package Chapter3;

public class Ex13 {
    public static void main(String[] args) {
        // nửa trên
        for(int i = 0; i < 4; i++){ //rows
            for(int k = 0; k < i; k++){
                System.out.print("  ");
            }
            for(int j = 1; j < 10 - i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // nửa dưới
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 2 - i; k++){
                System.out.print("  ");
            }
            for(int j = 2 - i; j <= 7 + i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
