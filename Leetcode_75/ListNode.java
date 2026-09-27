
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Leetcode_68 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find length and last node
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Normalize k
        k = k % length;
        if (k == 0) {
            return head;
        }

        // Step 3: Make the list circular
        tail.next = head;

        // Step 4: Find the new tail (length - k steps from head)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Step 5: Break the circle and return
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}