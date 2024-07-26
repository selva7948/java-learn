//  creating a calculator 
import java.util.*;

class calculater {
    public static void main(String[] args) {
        while (true) {
            try (Scanner Scanner = new Scanner(System.in)) {
                System.out.println("enter your expression");
                String x = Scanner.nextLine();
                if (x.contains("+")) {
                    String[] y = x.split("\\+");
                    int a = Integer.parseInt(y[0]);
                    int b = Integer.parseInt(y[1]);
                    System.out.println(a + b);
                }
                if (x.contains("-")) {
                    String[] y = x.split("\\-");
                    int a = Integer.parseInt(y[0]);
                    int b = Integer.parseInt(y[1]);
                    System.out.println(a - b);
                }
                if (x.contains("*")) {
                    String[] y = x.split("\\*");
                    int a = Integer.parseInt(y[0]);
                    int b = Integer.parseInt(y[1]);
                    System.out.println(a * b);
                }
                if (x.contains("/")) {
                    String[] y = x.split("/");
                    int a = Integer.parseInt(y[0]);
                    int b = Integer.parseInt(y[1]);
                    System.out.println(a / b);
                }
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}