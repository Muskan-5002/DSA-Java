package Strings;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "muskan";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        char[] arr = sb.toString().toCharArray();
    }
}
