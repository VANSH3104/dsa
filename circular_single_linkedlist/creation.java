package dsa.circular_single_linkedlist;

public class creation {
    public class Node {
        public int data;
        public Node next;
    }
    public class circularlink{
        public Node head;
        public Node tail;
        public int size;
        circularlink(){
            head=null;
            tail=null;
            size=0;
        }
        public void create(int nodevalue){
            Node no = new Node();
            no.data = nodevalue;
            if(head == null)
            {
                head = no;
                tail = no;
                no.next = head;
            }
            else {
                tail.next = no;
                tail = no;
                no.next = head;
            }
            size++;
        }
        
        public void display() {
            if (head != null) {
                Node temp = head;
                do {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                } while (temp != head);
                System.out.println();
            } else {
                System.out.println("The circular linked list is empty.");
            }
        }     
    }
    public static void main(String[] args) {
        creation Cre = new creation();
        circularlink cir = Cre.new circularlink();
        cir.create(7);
        // cir.create(3);
        // cir.create(4);
        // cir.create(6);
        System.out.println(cir.head.next    );
        cir.display();
    }
}
