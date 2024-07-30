package string;  
import java.util.Arrays;
public class short_a_string {
    public static void main(String[] args) {
        String a = "abc Abc Bbc bbc Caa caa ";
        String[] b = a.split(" ");
        Arrays.sort(b);
        for (String string : b) {
            System.out.println(string);
        }
    }
}

