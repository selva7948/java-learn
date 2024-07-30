package string;
class replace_string {
    public static int count(String s, char x){
        int c1=x-32;
        char y=(char) (c1);
        int cn=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x||s.charAt(i) ==y){
                cn++;
            }
        }
        return cn;
    }
    public static void main(String[] args) {
        String s="abcdArteiETjshT";
        char x='t';
        int cn=count(s,x);
        System.out.println(cn);
    }
}