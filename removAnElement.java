// remove an element from an array
public class removAnElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int num = 2;
        int brr[] = new int[arr.length - 1];
        for (int i = 0; i < brr.length; i++) {
            if (i!=num) {
                brr[i] = arr[i];
            }
            else{
                i--;
            }
        }
        for (int i : brr) {
            System.out.println(i);
        }
    }
}