import java.util.*;

public class reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        ArrayList<Integer>brr=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            brr.add(arr[i]);
        }
        for (Integer integer : brr) {
            System.out.println(integer);
        }
    }
}
