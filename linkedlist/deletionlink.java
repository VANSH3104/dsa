package dsa.linkedlist;

public class deletionlink {
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
    public void delete(int location)
    {
        if(head == null)
        {
            System.out.println("list is empty");
        }
        else if(location == 0)
        {
            head = head.next;
            size --;
            if(size == 0)
            {
                tail = null;
            }
        }
        else if(location>=size-1)
        {
            Node node = head;
           for(int i =0;i<size-2;i++)
           {
            node = node.next;
           }
           if(node == head && size ==1)
           {
            tail = head = null;
            return;
           }
           node.next = null;
           tail = node;
           size--;

        }
        else 
        {
            Node node = head;
            for(int i =0;i<location-1;i++)
            {
                node = node.next;
            }
            node.next= node.next.next;
            size--;
        }
    }
    
}
public static void main(String[] args) {
    deletionlink single = new deletionlink();
    singlelist list = single.new singlelist();
    list.create(5);
    list.create(10);
    list.create(50);
    list.create(60);
    list.create(100);
    list.delete(2);
    list.display();
}
}
