package Chapter4;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] integers = {1, 10, 19, 8, 5, 7};

        Arrays.sort(integers);

        for(int i= 0; i < integers.length; i++){
            System.out.println(integers[i]);
        }
//C1
//        for(int i = 0; i < integers.length - 1; i++){
//            for(int j = i + 1; j < integers.length; j++){
//                if(integers[i] > integers[j]){
//                    int temp = integers[j];
//                    integers[j] = integers[i];
//                    integers[i] = temp;
//                }
//            }
//        }
//
//        for(int i = 0; i < integers.length; i++){
//            System.out.println(integers[i]);
//        }
    }
}
