package Linked_list;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ListNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        System.out.println(a.val);
        Node b = new Node(20);
        System.out.println(b);
        Node c = new Node(30);
        System.out.println(c.next);
        // Node d = new Node(40);
        // Node e = new Node(50);

        a.next = b;
        b.next = c;
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(b.next.val);
    }
}
