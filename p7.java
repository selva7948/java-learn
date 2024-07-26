// find the sum of two num that give the given nnumber
public class p7 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 5, 6 };
        int num = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
}