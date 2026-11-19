package Recursion;
import java.util.Scanner;
public class generateParentheses {
    public static void print(int n, int open, int close, String s) {
  
        if(s.length()==2*n) {
            System.out.println(s);
            return;
        }
        if(open < n) print(n, open+1, close, s+"(");
        if(close < open) print(n, open, close+1, s+")");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n, 0, 0, "");
    }
}
