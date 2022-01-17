class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while(runner!=null&&runner.next!=null)
        {
            walker = walker.next;
            runner = runner.next.next;
        }
        if(runner!=null)
            walker = walker.next;
        
        walker = reverse(walker);
        runner = head;
        while(walker!= null)
        {
            if(walker.val!=runner.val)
                return false;
            walker = walker.next;
            runner = runner.next;
        }
        return true;   
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        while(head!=null)
        {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}