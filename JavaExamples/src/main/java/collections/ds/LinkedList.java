package collections.ds;

public class LinkedList<T> {

    Node head;

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node node = new Node(data);
        node.next = null;
        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) { temp = temp.next; }
        temp.next = node;
    }

    public void remove(T data) {
        Node temp = head;

        if (isEq(temp, data)) { head = temp.next; return; }

        Node prev = head;
        temp = temp.next;
        while (temp.next != null) {
            if (isEqual(temp, prev, data)) return;
            prev = temp;
            temp = temp.next;
        }
        isEqual(temp, prev, data);
    }

    private boolean isEqual(Node temp, Node prev, T data) {
        if (isEq(temp, data)) {
            prev.next = temp.next;
            temp.next = null;
            return true;
        }
        return false;
    }

    private boolean isEq(Node temp, T data) {
        if (temp.data.equals(data)) return true;
        return false;
    }

    public void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }


    public static void main(String s[]) {
        LinkedList<String> l = new LinkedList<>();
        l.add("a");l.add("b");l.add("c");
        l.display();
        l.remove("c");
        l.display();
    }

}
