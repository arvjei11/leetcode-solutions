class Solution {
    public int length(ListNode head){
        int length=0;
        if(head==null) return length;
        if(head.next==null) return length+1;
        ListNode current = head;
        while(current!=null){
            current = current.next;
            length++;
        }
        return length;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head ==null)
            return null;
        int lengths = length(head);
        ListNode current = head;
        if(lengths==1)
        {
            head=null;
            return head;
        }
        if(lengths==n)
        {
            head= current.next;
            return head;
        }
        for(int i =0;i<lengths-n-1;i++)
        {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
        
    }
}