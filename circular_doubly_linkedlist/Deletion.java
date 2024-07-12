package dsa.circular_doubly_linkedlist;

public class Deletion {
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
    public boolean find(int nodevalue){
        if(head!=null){
        Node nod = head;
        for(int i =0;i<size;i++){
            if(nod.data == nodevalue){
                System.out.println("node is found at location "+i);
                return true;
            }
            nod = nod.next;
        }
        }
        System.out.println("not found");
        return false;
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
        Deletion cre = new Deletion();
        creation c = cre.new creation();
        c.createing(2);
        c.createing(3);
        c.createing(5);
        c.insert(45, 0);
        c.insert(8, 9);
        c.insert(0, 3);
        System.out.println();
        c.find(5);
        c.display();
    }
    }
}


