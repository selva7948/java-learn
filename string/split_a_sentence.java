package string;
//split the sentnce and replace a word
import java.util.*;
public class split_a_sentence {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your string");
        String a1 = a.nextLine();
        System.out.println("enter your word want to check");
        String b1 = a.nextLine();
        System.out.println("enter your replacing word");
        String c1 = a.nextLine();
        for (int i = 0; i < a1.length();) {
            String temp = "";
            for (int j = i; j < a1.length(); j++) {
                if (a1.charAt(i) == ' ') {
                    i++;
                    break;
                } else {
                    temp += a1.charAt(i);
                    i++;
                }
            }
            if(temp.equals(b1)){
            System.out.print(" "+c1);
            }
            else{
                System.out.print(" "+temp);
            }
        }
    }
}