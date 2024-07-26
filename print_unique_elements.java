import java.lang.reflect.Array;
import java.util.Arrays;

public class print_unique_elements {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 1, 2, 5, 4 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != Integer.MAX_VALUE) {
                    arr[j] = Integer.MAX_VALUE;
                    count++;
                }
            }
        }
        int brr[] = new int[arr.length - count];
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MAX_VALUE) {
                brr[b] = arr[i];
                b++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}