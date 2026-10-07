package PATTERN_PRINTING;

import java.util.Scanner;

public class oddNumberTriangle {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // method 1
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=i; j++){
        //         System.out.print(2*j-1+" ");
        //     }
        //     System.out.println();
        // }  
        

        //method 2
        for(int i=1; i<=n;i++){ //rows
            int a = 1;
            for(int j=1;j<=i; j++){ // cols
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }   
    }
}
