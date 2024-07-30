package string;
public class string_to_binary {
    public static void main(String[] args) {
        String sc="god";
        for(int i=0;i<sc.length();i++){
            int j=sc.charAt(i);
            System.out.println(Integer.toBinaryString(j)+" "+sc.charAt(i));
        }
    }
}
