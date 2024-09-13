package dsa.circular_single_linkedlist;

public class insertion {
    public class Node {
        public int data;
        public Node next;
    }

    public class circularlink {
        public Node head;
        public Node tail;
        public int size;

        circularlink() {
            head = null;
            tail = null;
            size = 0;
        }

        public void create(int nodevalue) {
            Node no = new Node();
            no.data = nodevalue;
            if (head == null) {
                head = no;
                tail = no;
                no.next = head;
            } else {
                tail.next = no;
                tail = no;
                no.next = head;
            }
            size++;
        }

        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "=>");
                current = current.next;
            }
            System.out.println();
        }

        public void insert(int location, int value) {
            Node ne = new Node();
            ne.data = value;
            if (head == null) {
                create(value);
                return;
            } else if (location == 0) {
                ne.next = head;
                head = ne;
                tail.next = ne;
                size++;
                return;
            } else if (location >= size) {
                tail.next = ne.next;
                tail = ne;
                tail.next = head;
                size++;
                return;
            } else {
                Node node = head;
                for (int i = 0; i < location; i++) {
                    node = node.next;
                }
                ne.next = node.next;
                node.next = ne;
                size++;
                return;
            }
        }

        public static void main(String[] args) {
            insertion insert = new insertion();
            circularlink list = insert.new circularlink();
            list.create(5);
            list.create(10);
            list.create(50);
            list.insert(3, 0);
            list.insert(88, 3);
            System.out.println(list.tail.data);
            list.display();
        }
    }
}
