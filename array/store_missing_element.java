package array;
import java.util.ArrayList;
import java.util.Arrays;
public class store_missing_element {
    public static void main(String[] args) {
        int[] arr={11,14,16};
        Arrays.sort(arr);
        Integer min=arr[0];
    
        ArrayList<Integer>brr=new ArrayList<>();
        
        for (int k = 0; k < arr.length; k++) {
            if (min == arr[k]) {
                // System.out.println(arr[k]);
                min++;
            } else {
                brr.add(min);
                // System.out.println("missing :" + min);
                min++;
                k--;
            }
        }
        for (Integer i : brr) {
            System.out.println(i);
        }
}
}