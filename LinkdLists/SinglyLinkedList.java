package LinkdLists;

public class SinglyLinkedList {
    Node head;
    private int size;

    SinglyLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void PrintLL() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;

        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void getSize() {
        System.out.println("List size : " + size);
    }

    public void reverseNode() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        SinglyLinkedList List = new SinglyLinkedList();
        List.addLast("Prince");
        List.addLast("Kurmi");
        List.addLast("Mayank");
        List.addLast("Gangwar");
        List.head = List.reverseRecursive(List.head);
        List.PrintLL();

    }
}
