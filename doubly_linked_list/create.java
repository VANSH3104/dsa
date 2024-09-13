package dsa.doubly_linked_list;

public class create {
    public class Node {
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
        public void create(int nodevalue){
            Node node = new Node();
            node.data = nodevalue;
            if(head == null){
                tail = head = node;
                head.prev = null;
                tail.next = null;
            }
            else{
                tail.next = node;
                node.prev = tail;
                tail = node;
                node.next = null;
            }
            size++;
        }
        public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }
} 
    public static void main(String[] args) {
        create cre = new create();
        creation c = cre.new creation();
        c.create(2);
        c.create(4);
        c.create(6);
        System.out.println(c.head.next.prev.data);
        c.display();
    }
}
