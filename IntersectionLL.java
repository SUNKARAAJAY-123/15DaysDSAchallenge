 class IntersectionLL {
     ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        // Intersection example:
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        ListNode headB = new ListNode(99);
        headB.next = common;

        IntersectionLL sol = new IntersectionLL();
        ListNode intersection = sol.getIntersectionNode(headA, headB);
        if (intersection != null)
            System.out.println("Intersection at node with value: " + intersection.val);
        else
            System.out.println("No intersection");
    }
}
