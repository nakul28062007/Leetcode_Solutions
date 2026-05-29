package leetcode.easy;

public class LC141_LinkedListCycle {
    public static class Solution {
        static class ListNode{
            int val;
            ListNode next;
            ListNode(int val){
                this.val=val;
                this.next=null;
            }
        }
        public boolean hasCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            boolean ans = false;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    ans=true;
                    break;
                }
            }
            return ans;
        }

        static void main() {
            Solution obj = new Solution();
            ListNode cycleNode = new ListNode(2);
            ListNode newNode = new ListNode(3);
            newNode.next = cycleNode;
            newNode.next.next = new ListNode(0);
            newNode.next.next.next = new ListNode(4);
            newNode.next.next.next.next= cycleNode;
            System.out.println("Has Cycle?: "+obj.hasCycle(newNode));


        }
    }
}
