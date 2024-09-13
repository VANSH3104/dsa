package dsa.doubly_linked_list;

public class deletion {
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
        public void deletion(int location){
            if(head==null){
                System.out.println("the dll not exist");
                return;
            }else if(location == 0){
                if(size == 1){
                    head = null;
                    tail = null;
                    size--;
                }
                else{
                    head = head.next;
                    head.prev= null;
                    size--;
                }
            }else if(location>=size){
                if(size == 1){
                    head = null;
                    tail = null;
                }
                else{
                    tail = tail.prev;
                    tail.next = null;
                    size--;                }
            }else{
                 Node temp = head;
                for (int i = 0; i < location - 1; i++) {
                    temp = temp.next;
                }
                Node nodeToDelete = temp.next;
                temp.next = nodeToDelete.next;
                if (nodeToDelete.next != null) {
                    nodeToDelete.next.prev = temp;
                }
                size--;
            }
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
        deletion cre = new deletion();
        creation c = cre.new creation();
        c.create(2);
        c.create(4);
        c.create(6);
        c.insert(7, 2);
        c.insert(70, 0);
        c.display();
        c.deletion(0);
        c.display();
        c.deletion(2);
        c.display();
        c.deletion(5);
        c.display();
    }
 
}
