public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode runner = head;
        ListNode walker = head;
        while(runner!=null&&runner.next!=null)
        {
            walker = walker.next;
            runner = runner.next.next;
            if(runner==walker)
            {
                ListNode walker2 = head;
                while(walker!=walker2)
                {
                    walker = walker.next;
                    walker2 = walker2.next;
                }
                return walker2;
            }
        }
        return null;
    }
}