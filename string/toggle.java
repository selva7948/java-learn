package string;

public class toggle {
    public static void main(String[] args) {
        String s = "tamilarasan";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i > 0 && ch >= 'a' && ch <= 'z') {
                s1 = s1 + (char) (ch - 32);
            } else if (i != 0) {
                s1 += ch;
            } else if (i == 0 && ch >= 'A' && ch <= 'Z') {
                s1 = s1 + (char) (ch + 32);
            } else {
                s1 += ch;
            }
        }
        System.out.println(s1);
    }
}
