class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class ReverseLinkedlist {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;


        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode current = prev.next;
        ListNode nextNode = null;

        for (int i = 0; i < right - left; i++) {
            nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseLinkedlist solution = new ReverseLinkedlist();

        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = createList(arr1);
        ListNode result1 = solution.reverseBetween(head1, 2, 4);
        printList(result1); 

        int[] arr2 = {5};
        ListNode head2 = createList(arr2);
        ListNode result2 = solution.reverseBetween(head2, 1, 1);
        printList(result2); 
    }
}
