package LOOPS;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            sum +=lastDigit;
            n/=10;
        }
        System.out.println(sum);
    }
}
