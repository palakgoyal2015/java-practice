// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }

}
class Main {
    static void printList(ListNode head){
    ListNode current=head;
    while(current!=null){
        System.out.print(current.val+" ");
        current=current.next;
    }
    }
    static int length(ListNode head){
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    static boolean isPresent(ListNode head,int k){
        ListNode current=head;
        while(current!=null){
            if(current.val==k){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    static ListNode insertAtBeginning(ListNode head,int k){
        ListNode newNode=new ListNode(k);
        newNode.next=head;
        return newNode;
        
    }
    static void insertAtEnd(ListNode head,int k){
        ListNode newNode=new ListNode(k);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    static ListNode deleteFirstNode(ListNode head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }
    static ListNode deleteLastNode(ListNode head){
        if(head==null||head.next==null){
            return null;
        }
        ListNode current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return head;
    }
    static ListNode reverseLinkedList(ListNode head){
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
    static ListNode middleLinkedList(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
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
    static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                current.next=list1;
                list1=list1.next;
            }else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        if(list1!=null){
            current.next=list1;
        }else{
            current.next=list2;
        }
        return dummy.next;
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