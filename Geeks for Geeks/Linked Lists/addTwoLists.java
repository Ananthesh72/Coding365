class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class addTwoLists {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = null;
        Node head2 = new Node(9);
        head2.next = new Node(9);
        head2.next.next = new Node(9);
        head2.next.next.next = null;
        addTwoLists obj = new addTwoLists();
        Node result = obj.addTwoLists_(head1, head2);
        // Print the result
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
        System.out.println();
    }

    public Node addTwoLists_(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }
}
