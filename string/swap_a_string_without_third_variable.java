package string;

public class swap_a_string_without_third_variable {
    public static void main(String[] args) {
        String a = "hello";
        String a2 = "";
        String b = "world ";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                a2 += a.charAt(i);
            }
        }
        a += b;
        b = a.substring(0, a.length() - b.length()); // helloworld :(0,5-5)(0-5) (hello)
        a = a.substring(b.length());// helloworld :(5) (world)
        System.out.println(a);
        System.out.println(b);
    }
}