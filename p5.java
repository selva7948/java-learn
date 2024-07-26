// find the missing elements in an array
public class p5 {
    public static void main(String[] args) {
        int arr[] = { 11, 2, 5, 7, 10, 6, 1, 13 };
        for (int k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[k] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        for (int x : arr) {
            System.out.println(x);
        }
        int st = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (st == arr[i]) {
                st++;
            } else {
                System.out.println("missing :" + st);
                st++;
                i--;
            }
        }
    }
}