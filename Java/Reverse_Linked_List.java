class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        System.gc();
        return prev;
    }
}