package string;

public class int_to_string {
    public static void main(String[] args) {
        String a = "120";
        int num = 3;
        int sum = 0;
        char[] a1 = a.toCharArray();
        for (int j = 0; j < a1.length; j++) {
           int temp=a.charAt(j)-48;
            sum=sum*temp+10;
        }
        System.out.println(sum);
    }
}
