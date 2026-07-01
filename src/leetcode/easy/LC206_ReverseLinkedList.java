package leetcode.easy;

public class LC206_ReverseLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode curr=head;
            ListNode prev=null;
            ListNode next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev = curr;
                curr=next;
            }
            return prev;
        }
    }

    static void main() {
        Solution obj = new Solution();
        ListNode node = new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(5);

        ListNode head = obj.reverseList(node);
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
