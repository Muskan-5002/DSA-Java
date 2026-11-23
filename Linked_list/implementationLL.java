package Linked_list;

public class implementationLL {
    static class SLL{
        Node head;
        Node tail;
        int size;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
         void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
         }
    }
    public static void main(String[] args){
        SLL list = new SLL();
        // list.insertAtEnd(10);
        // list.insertAtEnd(20);
        // list.insertAtEnd(30);   
        // list.insertAtEnd(40);
        // list.display();
        // list.insertAtEnd(25);
        // list.display();
        System.out.println(list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        System.out.println(list.size);
        list.display();
    }
}
