package LinkedList.Doubly;

public class DoublyList {
    Node head;

    public void insert(int value){
        if(head == null){
            Node newNode = new Node(value);
            head = newNode;
            return;
        }

        Node newNode = new Node(value);
        head.prev = newNode;
        newNode.next = head;
        head=newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("No items in list");
            return;
        }
        Node curr=head;
        while (curr != null){
            System.out.print(curr.value+" <=> ");
            curr = curr.next;
        }
        System.out.println("START");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
