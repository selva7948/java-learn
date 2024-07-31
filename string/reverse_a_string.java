package string;

import java.util.ArrayList;

//reverse a string without changing order and also increce the count 
public class reverse_a_string {
    public static void main(String[] args) {
        String a = "hello  ";
        ArrayList<String> arr=new ArrayList<>();
        int count = 0;
        for (int i = 0; i < a.length();) {
            String temp = "";
            for (int j = i; j < a.length(); j++) {
                if (a.charAt(i) == ' ') {
                    i++;
                    break;
                } else {
                    temp += a.charAt(i);
                    i++;
                }
            }
            if(temp.length()>0){
                count++;
            }
            arr.add(temp);
            System.out.print(reverse(temp) + " ");
        }
      
        System.out.println(count);
    }



    public static String reverse(String temp) {
        String a1 = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            a1 += temp.charAt(i);
        }
        return a1;
    }
}