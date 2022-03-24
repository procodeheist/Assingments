package LinkedList.Singly;

public class LinkList {
    private Node head;
    private Node tail;
    private int size;

    public LinkList() {
        this.size=0;
    }

    public void insertFirstNode(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirstNode(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void displayNode(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertGivenIndex(int index,int value){
        if(head == null){
            insertFirstNode(value);
            return;
        }
        if(size == index){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(value,temp.next);
        temp.next = newNode;
        size++;

    }

    public void insertAtIndexRecursive(int start,int index,int value){
        if(head == null || index == 0){
            insertFirstNode(value);
            return;
        }

    }

    private class Node{

        private int value;
        private Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }


}
