package Chuong3;

public class Ex20 {
    public static void main(String[] args) {
        long number, result;
        number = 6;
        result = factorial(number);
        System.out.println(result);
    }
    public static long factorial(long value){ // 6! = 1x2x3x4....x6
        long result = 1;
        for(int i = 2; i<=6; i++){
            result *= i;
        }
        return result;
    }
}
