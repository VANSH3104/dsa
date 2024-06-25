package dsa.linkedlist;

public class singlelinkedlist {
    class Node{ 
        public int data ; 
        public Node next ; 
    }
    public class singlelist{
        public Node head;
        public Node tail;
        public int size;

        public singlelist() {
            head = null;
            tail = null;
            size = 0;
        }
    public void create(int nodevalue)
    {
        Node no = new Node();
        no.data = nodevalue;
        no.next = null;
        if(head==null)
        {
            head = no;
            tail = no;
        }
        else{
            tail.next =no;
            tail=no;
        }
        size ++;
    }
     public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
}


    public static void main(String[] args) {
        singlelinkedlist single = new singlelinkedlist();
        singlelist list = single.new singlelist();
        list.create(5);
        list.create(10);
        list.create(50);
        list.display();
    }
}