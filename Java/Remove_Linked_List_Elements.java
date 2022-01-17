class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next  =head;
        ListNode prev = dummy;
        ListNode current = head;
        while(current!=null){
            if(current.val==val)
            {
                prev.next = current.next;
            }
            else
                prev = prev.next;
            current = current.next;
        }
        
        return dummy.next;
        
    }
}