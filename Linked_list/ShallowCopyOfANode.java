package Linked_list;

public class ShallowCopyOfANode {
    public static void main(String[] args) {
        // Node a = new Node(10);
        // Node b = a;  //shallow copy of a
        // System.out.println(a.val);  //10
        // System.out.println(b.val);  //10
        // b.val = 20;
        // System.out.println(a.val);  //20
        // System.out.println(b.val);  //20

        // Node a = new Node(100);
        // System.out.println(a.val);  //100
        // Node temp = a;  //shallow copy of a
        // temp.val = 12;
        // System.out.println(a.val);  //12

        Node a = new Node(10); // head
        Node b = new Node(23);
        Node c = new Node(37);  
        Node d = new Node(48);
        Node e = new Node(53);
        a.next = b; //10->23
        b.next = c; //10->23->37
        c.next = d; //10->23->37->48
        d.next = e; //10->23->37->48->53

        Node temp = a;
        for(int i=1; i<=5; i++){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
