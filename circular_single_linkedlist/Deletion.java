package dsa.circular_single_linkedlist;

public class Deletion {
    public static class Node {
        public int data;
        public Node next;
    }

    public class CircularLink {
        public Node head;
        public Node tail;
        public int size;

        CircularLink() {
            head = null;
            tail = null;
            size = 0;
        }

        public void create(int nodeValue) {
            Node node = new Node();
            node.data = nodeValue;
            if (head == null) {
                head = node;
                tail = node;
                node.next = head;
            } else {
                tail.next = node;
                tail = node;
                tail.next = head;
            }
            size++;
        }

        public void delete(int location) {
            if (head == null) {
                System.out.println("The list is not found");
                return;
            } else if (location == 0) {
                // Deleting the head node
                if (size == 1) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                    tail.next = head;
                }
                size--;
            } else if (location >= size - 1) {
                // Deleting the tail node
                if (size == 1) {
                    head = null;
                    tail = null;
                } else {
                    Node temp = head;
                    while (temp.next != tail) {
                        temp = temp.next;
                    }
                    temp.next = head;
                    tail = temp;
                }
                size--;
            } else {
                // Deleting a node at the given location
                Node temp = head;
                for (int i = 0; i < location - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        public void display() {
            if (head == null) {
                System.out.println("The list is empty");
                return;
            }
            Node current = head;
            do {
                System.out.print(current.data + " => ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Deletion deletion = new Deletion();
        CircularLink list = deletion.new CircularLink();
        list.create(5);
        list.create(10);
        list.create(50);
        list.display();
        list.delete(1);
        list.display();
        list.delete(0);
        list.display();
        list.delete(0);
        list.display();
    }
}
