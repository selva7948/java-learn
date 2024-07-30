package string;
public class palindrom {
    public static void main(String[] args) {
        String ac="madam";
        String bc="";
        for(int i=ac.length()-1;i>=0;i--){
            bc+=ac.charAt(i);
        }
        if(ac.equalsIgnoreCase(bc)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}
