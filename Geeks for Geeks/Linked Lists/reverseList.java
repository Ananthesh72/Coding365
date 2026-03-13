import java.util.Arrays;

class Node {

    Node next;
    int data ;
    Node(int data){
        this.data = data;
        this.next =null;
    }
}

public class reverseList{
    public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);

       reverseList obj = new reverseList();
        obj.reverseList_test(head);

        while (head.next != null) {
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.print(head.data + "-->" + head.next+" ");
    }


    public Node reverseList_test(Node head) {
        // code here
        if(head == null||head.next == null) 
            return head;
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        return prev;
    }
}