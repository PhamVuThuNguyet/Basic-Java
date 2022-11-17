package Chapter4;

public class Ex5_nosolution {
    public static int fact(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < ints.length; i++) {
            ints[i] = fact(ints[i]);
        }


        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }

        for (int x : ints) {
            System.out.println(x);
        }
    }
}
