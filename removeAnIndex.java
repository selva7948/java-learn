//  remove an index from an array
public class removeAnIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int num = 2;
        int brr[] = new int[arr.length-1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != num) {
                brr[count] = arr[i];
                count++;
            }
        }
        for (int i : brr) {
            System.out.println(i);
        }
    }
}
