package dsa.doubly_linked_list;

public class traversal {
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
        public void traversal(){
            if(head != null){
                Node no = head;
                for(int i =0;i<size;i++){
                    System.out.print(no.data);
                    if(i!=size-1){
                        System.out.print("=>");
                    }
                    no = no.next;
                }
            }
            else {
                System.out.println("the dll is not exist");
            }
            System.out.println("\n");
        }
        public void reversetraversal(){
            if(head != null){
                Node no = tail;
                for(int i =size;i>0;i--){
                    System.out.print(no.data);
                    if(i!=1){
                        System.out.print("<=");
                    }
                    no = no.prev;
                }
            }
            else {
                System.out.println("the dll is not exist");
            }
            System.out.println("\n");
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
        traversal cre = new traversal();
        creation c = cre.new creation();
        c.create(2);
        c.create(4);
        c.create(6);
        c.insert(7, 2);
        c.insert(70, 0);
        System.out.println(c.head.next.prev.data);
        c.traversal();
        c.reversetraversal();
    }
 
}
