package dsa.doubly_linked_list;

public class searching {
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
        public void insert(int nodevalue , int location){
            Node node = new Node();
            node.data = nodevalue;
            if(head == null){
                create(nodevalue);
                return;
            }
            else if(location == 0){
                node.prev = null;
                node.next = head;
                head.prev = node;
                head = node;
                size++;
            }
            else if(location>=size){
                node.next = null;
                node.prev = tail;
                tail.next = node;
                tail = node;
                size++;
            }
            
            else {
                Node no = head;
                int index = 0;
                while(index < location-1){
                    no= no.next;
                    index++;
                }
                node.prev = no;
                node.next = no.next;
                no.next = node;
                node.next.prev = node;
                size++;
            }
        }
        public boolean searching(int nodevalue){
            if(head != null){
                Node no = head;
                for(int i =0;i<size;i++){
                    if(no.data == nodevalue){
                        System.out.println("this node of value "+nodevalue+" is found at "+(i+1));
                        return true;
                    }
                    no = no.next;
                }
            }
            System.out.println("Node not found");
            return false;
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
        searching cre = new searching();
        creation c = cre.new creation();
        c.create(2);
        c.create(4);
        c.create(6);
        c.insert(7, 2);
        c.insert(70, 0);
        c.searching(4);
        c.searching(45);
    }
 
}
