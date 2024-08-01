package string;

public class reverse_a_sentence {
    public static void main(String[] args) {
        String a = "hello my name is selva";
        String[] a2 = a.split(" ");
        for (int i = a2.length - 1; i >= 0; i--) {
            System.out.print(a2[i] + " ");
        }
        for (int i = 0; i < a2.length; i++) {
            char[] b = a2[i].toCharArray();
            for (int j = b.length - 1; j >= 0; j--) {
                System.out.print(b[j]);
            }
            System.out.print(" ");
        }
    }
}