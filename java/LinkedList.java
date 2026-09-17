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