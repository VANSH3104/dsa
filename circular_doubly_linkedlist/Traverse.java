package dsa.circular_doubly_linkedlist;

public class Traverse {
   public class Node{
        public int data;
        public Node next;
        public Node prev;
    }
    public class creation{
        public Node head;
        public Node tail;
        public int size;
        creation(){
            head = null;
            tail = null;
            size = 0;
        }
    public void createing(int nodevalue){
        Node node = new Node();
        node.data = nodevalue;
            if(head == null){
                tail = head = node;
                head.prev = tail;
                tail.next = head;
            }
            else{
                tail.next = node;
                node.prev = tail;
                node.next = head;
                head.prev = node;
                tail = node;
            }
            size++;
    }
    public void insert(int nodevalue , int location){
        Node node = new Node();
        node.data = nodevalue;
        if(head == null){
            createing(nodevalue);
            return;
        }
        else if(location == 0){
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        }
        else if(location>=size){ 
                node.next = head;
                node.prev = tail;
                head.prev = node;
                tail.next = node;
        }else{
            Node no = head;
            int index =0;
            while(index <= location-1){
                no = no.next;
                index++;
            }
            node.prev = no;
            node.next = no.next;
            no.next = node;
            node.next.prev = node;
        }
        size++;
    }
    public void traverse(){
        if(head != null){
            Node no = head;
            for(int i =0;i< size ;i++){
                System.out.print(no.data + " ");
                if(i!= size-1){
                    System.out.print("=>");
                }
                no= no.next;
            }
        }
        else{
            System.out.println("cdll not found");
        }
    }
    public void reverse(){
        if(head != null){
            Node no = tail;
            for(int i = 0;i<size ;i++){
                System.out.print(no.data + " ");
                if(i!=size-1){
                    System.out.print("<=");
                }
                no= no.prev;
            }
        }
    }
    public static void main(String[] args) {
        Traverse cre = new Traverse();
        creation c = cre.new creation();
        c.createing(2);
        c.createing(3);
        c.createing(5);
        c.insert(45, 0);
        c.insert(8, 9);
        c.insert(0, 3);
        System.out.println();
        c.traverse();
        System.out.println();
        c.reverse();
        System.out.println(c.tail.data);
    }
    }
}

