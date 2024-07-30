package string;
import java.util.*;
public class convert_to_binary {
    public static void main(String[] args) {
        int n = 8;
        StringBuilder bn = new StringBuilder();
        @SuppressWarnings("unused")
        ArrayList<Integer> brr = new ArrayList<>();
        while (n > 0) {
            int remainder=n%2;
            bn.insert(0, remainder);
            n/=2;
        }
       System.out.println(bn);
    }
}
