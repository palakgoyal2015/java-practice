    public static void main(String[] args) {
         ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fivth = new ListNode(10);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fivth;
        // fivth.next=second;
        // boolean ans=isPalindrome(head);
        // System.out.print(ans);
            // First sorted list
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);


        // Second sorted list
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);


        // Merge both lists
        head = mergeTwoLists(list1, list2);


        // Print merged list
        printList(head);
        // boolean ans=hasCycle(head);
        // System.out.print(ans);
        // ListNode middle=middleLinkedList(head);
        // System.out.print(middle.val);
        // head=deleteLastNode(head);
        // printList(head);
        // insertAtEnd(head,1);
        // printList(head);
        // boolean ans=isPresent(head,50);
        // System.out.print(ans);
        // printList(head);
        // int ans=length(head);
        // System.out.print(ans);
    }
}