package string;

import java.util.ArrayList;

//reverse a string without changing order and also increce the count 
public class reverse_a_string {
    public static void main(String[] args) {
        String a = "hello  world    hello www";
        int count = 0;
        String[] arr = new String[count];
        for (int i = 0; i < a.length();) {
            String temp = "";
            for (int j = i; j < a.length(); j++) {
                if (a.charAt(i) == ' ') {
                    i++;
                    break;
                }
                if (a.charAt(i) != ' ') {
                    temp += a.charAt(i);
                    i++;
                }
            }
            if (temp.length() > 0) {
                count++;
            }
            System.out.print(reverse(temp) + " ");
        }
    }

    public static String reverse(String temp) {
        String a1 = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            a1 += temp.charAt(i);
        }
        return a1;
    }
}