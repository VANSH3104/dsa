package dsa.linkedlist;

public class insertionlink {
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
                System.out.print(current.data + "=>");
                current = current.next;
            }
            System.out.println();
        }
    public void insert(int nodevalue, int location)
    {
        Node node = new Node();
        node.data = nodevalue;
        if(location == 0)
        {
            node.next = head;
            head = node;
        }
        else if(location>= size)
        {
            node.next= null;
            tail.next = node;
            tail = node;
        }
        else {
            Node tempNode = head;
            int index =0;
            while(index<location-1)
            {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }
    
}


    public static void main(String[] args) {
        insertionlink single = new insertionlink();
        singlelist list = single.new singlelist();
        list.create(5); 
        list.create(10);
        list.create(50);
        list.insert(3, 0);
        list.insert(9, 7);
        list.insert(88, 3);
        System.out.println(list.tail.data);
        list.display();
    }
}