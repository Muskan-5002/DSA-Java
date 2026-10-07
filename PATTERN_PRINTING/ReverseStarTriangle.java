package PATTERN_PRINTING;

import java.util.Scanner;

public class ReverseStarTriangle {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=1;j<=n+1-i; j++){    // i+j(max)=n+1
                System.out.print("* ");
            }
            System.out.println();
        }     
    }
}
