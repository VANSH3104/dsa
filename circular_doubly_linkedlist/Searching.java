package dsa.circular_doubly_linkedlist;

public class Searching {
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
    public void delete(int location){
        if(head == null){
            System.out.println("no cdll exist");
            return;
        }
        else if(location == 0){
            if(size == 1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
            }
            else{
                head = head.next;
                head.prev= tail;
                tail.next = head;
            }
            size--;
        }
        else if(location>=size){
            if(size == 1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
            }
            else{
                tail= tail.prev;
                tail.next = head;
                head.prev = tail;
            }
            size--;
        }
        else{
            Node node = head;
            for(int i=0;i<location-1;i++){
                node= node.next;
            }
            node.next = node.next.next;
            node.next.prev = node;
            size--;
        }
    }
    public static void main(String[] args) {
        Searching cre = new Searching();
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
        c.delete(1);
        c.display();
        c.delete(3);
        c.display();
        c.delete(10);
        c.display();
        System.out.println(c.tail.data);
    }
    }
}

