package Strings;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2, 6);
        System.out.println(sb);
        sb.insert(2,"svg");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
