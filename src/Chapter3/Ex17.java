package Chapter3;

public class Ex17 {
    // 1, 3, 7, 15, 31, 63,...
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        System.out.print(i +" ");
        while(i <= 100){
            System.out.print(i+j+" ");
            i += j;
            j = 2*j;
        }
    }
}
