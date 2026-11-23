package Linked_list;

public class CanWeDoItRecursively {
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void displayRecursive(Node head){
        System.out.println(head.val);
        displayRecursive(head.next);
    }
    public static void main(String[] args) {

        Node a = new Node(10); // head
        Node b = new Node(23);
        Node c = new Node(37);  
        Node d = new Node(48); 
        Node e = new Node(53);
        a.next = b; //10->23
        b.next = c; //10->23->37
        c.next = d; //10->23->37->48
        d.next = e; //10->23->37->48->53

        displayRecursive(a);
    }
}
 