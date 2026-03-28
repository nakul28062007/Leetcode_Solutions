package leetcode.easy;

public class LC83_RemoveDuplicatesFromSortedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next=null;
        }
    }

    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null) return null; //edge case
            ListNode current = head;
            while(current.next!=null){
                if(current.val==current.next.val){
                    current.next=current.next.next;
                }
                else{
                    current=current.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args){
        Solution obj = new Solution();
        ListNode head = new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);

        head = obj.deleteDuplicates(head);

        //print result
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("NULL");

    }


}
