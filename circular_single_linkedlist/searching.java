package dsa.circular_single_linkedlist;

public class searching {
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

        public boolean searchlist(int nodevalue){
            if(head!=null){
                Node temp = head;
                for(int i =0;i<size;i++){
                    if(temp.data== nodevalue){
                        System.out.println("found node at location" +i);
                        return true;
                    }
                    temp= temp.next;
                }
            }
            System.out.println("node not found");
            return false;
        }
        
        }

        public static void main(String[] args) {
            searching insert = new searching();
            circularlink list = insert.new circularlink();
            list.create(5);
            list.create(10);
            list.create(50);
            list.searchlist(10);
        }
    }
