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
        System.out.println(a.val);  //10
        Node b = new Node(20);
        System.out.println(b);      // Linked_list.Node@7344699f
        Node c = new Node(30);
        System.out.println(c.next);  //null
        // Node d = new Node(40);
        // Node e = new Node(50);

        a.next = b;  // a.next is pointing to b
        b.next = c;  // b.next is pointing to c
        System.out.println(a.next.val);   //20
        System.out.println(a.next.next.val);  //30
        System.out.println(b.next.val); //30
    }
}
