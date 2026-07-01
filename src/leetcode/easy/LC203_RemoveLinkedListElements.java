package leetcode.easy;

public class LC203_RemoveLinkedListElements {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
           ListNode dummy = new ListNode(-1);
           dummy.next=head;
           ListNode prev = dummy;
           ListNode curr = head;
           while(curr!=null){
               if (curr.val==val){
                   prev.next=curr.next;
               }
               else {
                   prev=curr;
               }
               curr = curr.next;
           }
           return dummy.next;
        }
    }

    static void main() {
        Solution obj = new Solution();
        ListNode node = new ListNode(6);
        node.next=new ListNode(1);
        node.next.next=new ListNode(2);
        node.next.next.next=new ListNode(6);
//        node.next.next.next.next=new ListNode(4);
//        node.next.next.next.next.next=new ListNode(5);
//        node.next.next.next.next.next.next=new ListNode(6);
        ListNode head = obj.removeElements(node,6);
        ListNode ptr = head;
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            if(ptr.next==null){
                System.out.print("NULL");
            }
            ptr=ptr.next;

        }
    }
}
