package dsa.circular_doubly_linkedlist;

public class Create {
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
            // node.prev = tail;
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
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node currentNode = head;
        do {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        } while (currentNode != head);
        System.out.println();
    }
    public static void main(String[] args) {
        Create cre = new Create();
        creation c = cre.new creation();
        c.createing(2);
        c.createing(3);
        c.createing(5);
        c.insert(45, 0);
        c.insert(8, 9);
        c.insert(0, 3);
        System.out.println();
        c.display();
    }
    }
}
