// merging two arrays
public class p4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int brr[] = { 4, 5, 6 };
        int crr[] = new int[arr.length + brr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            crr[count] = arr[i];
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            crr[count] = brr[i];
            count++;
        }
        for (int i : crr) {
            System.out.println(i);
        }
    }
}
