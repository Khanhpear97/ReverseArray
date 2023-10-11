import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] number = {1,2,4,6,8};
        number = remove(number, 2);
        System.out.println(Arrays.toString(number));
    }
    public static int[] remove(int[] array, int index) {
        int n = array.length;
        if (index >= n) {
            return array;
        }
        int[] result = new int[n - 1];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i == index) {
                continue;
            }
            result[k] = array[i];
            k++;
        }
        return result;
    }
}
