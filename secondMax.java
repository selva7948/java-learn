//find the max and second max
public class secondMax {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 1, 3 };
        int max = Integer.MIN_VALUE;
         int max2 =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max) {
                max = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max){
                 max2= arr[i];
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}