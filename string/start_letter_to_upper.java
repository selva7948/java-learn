package string;
public class start_letter_to_upper {
    public static void main(String[] args) {
        String a = "Hello welcome piy4gy piuwgfp 4ouv   ifgv 333@@@";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ' && i != 0) {
                String y = "";
                y += a.charAt(i + 1);
                System.out.print(" " + y.toUpperCase());
                i++;
            } else if (i == 0) {
                String y = "";
                y += a.charAt(i);
                System.out.print(y.toUpperCase());
            } else {
                System.out.print(a.charAt(i));
            }
        }
    }
}
