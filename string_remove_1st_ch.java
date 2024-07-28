public class string_remove_1st_ch {
    public static void main(String[] args) {
        String s="abcadydbajh";
        String b="";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!='a'){
            b+=s.charAt(i);
            }
        }
        System.out.println(b);
    }
}
