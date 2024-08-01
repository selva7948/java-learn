package string;

import java.util.*;

public class duplicate_string {
    public static void main(String[] args) {
        String input = "hello  world    hello world                  ";
        String[] words = new String[100];
        int count = 0;

        for (int i = 0; i < input.length();) {
            String temp = "";
            while (i < input.length() && input.charAt(i) != ' ') {
                temp += input.charAt(i);
                i++;
            }
            while (i < input.length() && input.charAt(i) == ' ') {
                i++;
            }
            if (!temp.isEmpty()) {
                words[count] = temp;
                count++;
            }
        }
        Duplicates(words, count);
    }

    public static void Duplicates(String[] words, int count) {
        System.out.println("Duplicate words:");
        for (int i = 0; i < count; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < count; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    words[j] = "";
                }
            }
            if (isDuplicate && words[i] != "") {
                System.out.println(words[i]);
            }
        }
    }
}
