package string;

import java.util.Scanner;

public class replace_a_string {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your string");
        String a1 = a.nextLine();
        String[] a2 = a1.split(" ");
        System.out.println("enter your word want to check");
        String b1 = a.nextLine();
        System.out.println("enter your replacing word");
        String c1 = a.nextLine();

        String a3 = "";
        for (int i = 0; i < a2.length; i++) {
            if (a2[i].equalsIgnoreCase(b1)) {
                a3 += " " + c1;
            } else {
                a3 += "  " + a2[i];
            }
        }
        System.out.println(a3);
    }
}
