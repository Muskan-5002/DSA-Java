package Strings;

public class interning {
    public static void main(String[] args) {
        String s = "Raghav";
        String q ="Madhav";
        String t = new String("Raghav");
        // s.charAt(0) ='M'; //Error
        // s.charAt(2) = 'd'; // Error
        // s = "Madhav";
        System.out.println(s);
        int[] arr = {1,2,3};
        int[] brr = {1,2,3};
        brr[0] = 10;
        System.out.println(arr[0]);
    }
}
