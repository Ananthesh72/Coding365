class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class remloopinlinkedlist {
    boolean loopExists = false;

    public static void main(String[] args) {
// 44 49 11 19 41 48
        Node head = new Node(44);
        head.next = new Node(49);
        head.next.next = new Node(11);
        head.next.next.next = new Node(19);
        head.next.next.next = new Node(48);

        remloopinlinkedlist obj = new remloopinlinkedlist();

        obj.removeLoop(head);

        while (head.next != null) {
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.print(head.data + "-->" + head.next+" ");
    }

    public void removeLoop(Node head) {
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                loopExists = true;
                break;
            }
        }
        if (loopExists) {
            remove(head, slow);
        }
    }

    private static void remove(Node head, Node meet) {
        Node ptr1 = head;
        Node ptr2 = meet;

        // Step 2: Find the starting node of the loop
        // Special case: meeting point is already the head
        if (ptr1 == ptr2) {
            while (ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
        } else {
            while (ptr1.next != ptr2.next) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }

        // Step 3: Break the loop
        ptr2.next = null;
    }
}
