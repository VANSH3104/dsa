package dsa.linkedlist;

public class serchinglink {
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
    boolean  findout(int nodevalue)
    {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if(temp.data == nodevalue)
            {
                System.out.println("present at location:"+i);
                return true;
            }
            temp = temp.next;
        }
        System.out.println("node not found");
        return false;
    }
}
public static void main(String[] args) {
    serchinglink single = new serchinglink();
    singlelist list = single.new singlelist();
    list.create(5);
    list.create(10);
    list.create(50);
    list.findout(10);
}
}
