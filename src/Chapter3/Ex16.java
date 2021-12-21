package Chapter3;

public class Ex16 {
    // 0, 3, 8, 15, 24, 35, 48,...
    public static void main(String[] args) {
        int i = 0;
        int j = 3;
        System.out.print(i+" ");
        while(i<=100){
            System.out.print(i+j+" ");
            i = i+j;
            j = j+2;
        }
    }
}
