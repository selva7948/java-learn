package array;
// find the duplicate element
public class duplicate_element {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 4,2};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}