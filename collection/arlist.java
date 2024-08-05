package collection;

import java.util.*;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class arlist {
   
    public static void main(String[] args) {
        int size=0;
        ArrayList a1 = new ArrayList();
        while (size<5) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        a1.add(sc.nextLine());
        size++;
        }
        System.out.println();
    //   for (Object object : a1) {
    //     System.out.println(object);
    //   }
    for(int i=0;i<a1.size();i++){
        System.out.println(a1.get(i));
    }
    }
}
