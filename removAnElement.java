// remove an element from an array

import java.util.Arrays;

public class removAnElement {
    public static void main(String[] args) {
        int arr[] = { 10,20,30};
        int brr[]=new int[arr.length-1];
        int num = 20;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=num) {
                brr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}