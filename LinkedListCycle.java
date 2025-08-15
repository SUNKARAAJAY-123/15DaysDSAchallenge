// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps

            if (slow == fast) { // cycle detected
                return true;
            }
        }
        return false; // no cycle
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Link nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // creates a cycle (node4 points back to node2)

        LinkedListCycle sol = new LinkedListCycle();
        boolean result = sol.hasCycle(node1);

        System.out.println("Does the linked list have a cycle? " + result);
    }
}

