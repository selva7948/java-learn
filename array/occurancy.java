package array;
// find the occurancy of the elemenys in the array
public class occurancy{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 8,2, 5 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int missing = max + 1;
        // System.out.println(max+"max");
        // System.out.println("missing : "+missing);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = missing;
                    count++;
                }
            }
            if (count > 0 && arr[i] != missing) {
                System.out.println("the frequency of " + arr[i] + " is " + count);
            }
        }
    }
}