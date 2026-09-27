
/*swaps Node in pairs
I/P :- Head = [1,2,3,4];
O/P :- Head = [2,1,4,3];
*/
class Node {
    int val;
    Node next;
    
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SwapnodeinPairs {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        SwapnodeinPairs obj = new SwapnodeinPairs();
       
            Node curr = head; 
        while(head.next !=null){
            System.out.print(head.val+"-->");
            head = head.next;
        }
        System.out.print(head.val+"-->"+head.next);
    }

    public Node swapPairs(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node point = dummy;

    // 3. Ensure there are at least two nodes left to swap
    while (point.next != null && point.next.next != null) {
        
        // Identify the nodes to be swapped
        Node first = point.next;     // Node 1
        Node second = point.next.next; // Node 2
        
        // --- THE SWAP ---
        // Step A: Point 1 to whatever comes after 2 (the rest of the list)
        first.next = second.next;
        
        // Step B: Point 2 back to 1
        second.next = first;
        
        // Step C: Point the 'handle' (dummy or previous pair) to 2
        point.next = second;
        
        // Move the pointer two steps forward to the next pair
        point = first; 
    }
    
    return dummy.next; // Return the new head (which is dummy.next)


    }
}

/*swaps Node in pairs
I/P :- Head = [1,2,3,4];
O/P :- Head = [2,1,4,3];

Node tail = head ;
Node curr = head ;
Node prev = curr.prev;

// firstly ill check the length of is it Pairs ? 

int len = 1;
while(tail.next !=null){
    tail.next = tail;
    len++;
}
int check = len % 2;
if(check !=0) return head;

tail.next = head;

head = curr.next;  // 2
head.next = curr.next.next; // 4 
  */