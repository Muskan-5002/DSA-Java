package Linked_list;

public class deleteNode {

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
        void insert(int idx, int val){
            if(idx == 0){
                insert(0, val);  // it means -> at head
                return;
            }
            if(idx == size){
                insertAtEnd(val);  // it means -> at tail
                return;
            }
            if(idx > size || idx < 0){
                System.out.println("Invalid index!!");
                return;
            }
            Node temp = new Node(val);
            Node x = head;
            for(int i=1; i<=idx-1; i++){
                x = x.next;
            }
            // insertion
            temp.next = x.next;
            x.next = temp;
            size++;
        }
        int get(int idx) throws Error{
            if(idx== size-1) return tail.val;
            if(idx >= size || idx < 0){
                throw new Error("Invalid index!!");
            }
            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.val;
        }
        void set(int idx, int val) throws Error{
            if(idx == size-1) tail.val = val;
            if(idx >= size || idx < 0){
                throw new Error("Invalid index!!");
            }
            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            temp.val = val;
        }
        void deleteAtHead() throws Error{
            if(head == null) throw new Error("List is empty!!");
            head = head.next;
            size--;
        }
        void delete(int idx) throws Error{
            if(idx == 0){
                deleteAtHead();
                return;
            }
            if(head == null) throw new Error("List is empty!!");
            if(idx < 0 || idx >= size){
                throw new Error("Invalid index!!");
            }
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
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
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
        list.insertAtEnd(40);
        list.display();
        list.insert(2,100);
        list.display();

        list.insert(10, 23);
        list.display();

        System.out.println(list.get(3));
        // System.out.println(list.get(-1));
        list.set(2,200);
        list.display();

        list.delete(1);
        list.display();
        System.out.println(list.size);
        list.delete(2);
        list.display();
        System.out.println(list.tail.val);

    }
}
