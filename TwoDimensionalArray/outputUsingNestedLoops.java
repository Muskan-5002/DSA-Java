package TwoDimensionalArray;

import java.util.Scanner;

public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //arr[0][0] = 9;

        int m = arr.length; // no of rows / lines
        int n = arr[0].length; // no of cols / lines
        System.out.println(n);

        // Input of 2D Array
        for(int i=0; i<m; i++){ //rows
            for(int j=0;j<n;j++){  // columns
                arr[i][j] = sc.nextInt();
            }
        }

        // output of 2D Array
        for(int i=0; i<m; i++){ //rows
            for(int j=0;j<n;j++){  // columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
