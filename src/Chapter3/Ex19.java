package Chapter3;

public class Ex19 {
    // 1, 3, 9, 27, 81, 243,...
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        System.out.print(i+" ");
        for(int k = 0; k < 9; k++){
            System.out.print(i+j+" ");
            i += j;
            j *= 3;
        }
    }
}
