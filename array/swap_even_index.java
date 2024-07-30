package array;
import java.util.Arrays;
public class swap_even_index {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        for(int i=1;i<arr.length-1;i++){
           int temp=arr[i-1];
           arr[i-1]=arr[i];
           arr[i]=temp;
           i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
