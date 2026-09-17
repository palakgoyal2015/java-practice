        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
            
        }
        return false;
    }
    static boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverse(slow);
        ListNode firstHalf=head;
        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }
    static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode nnext=current.next;
            current.next=prev;
            prev=current;
            current=nnext;
        }
        return prev;
    }
    
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
        boolean ans=isPalindrome(head);
        System.out.print(ans);
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