public class largest_in_k {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        int count=0;
        // for(int i=0;i<arr.length&&arr[i]!=k;i++){
           
        // }
       
        int i = 0;
        do {
            System.out.println(arr[i]);
            count++;
            i++;
        } while (i<arr.length&&arr[i]!=k);
        for (int j = arr.length - 1; j > count; j--) {
            System.out.println(arr[j]);
        }
    }
}