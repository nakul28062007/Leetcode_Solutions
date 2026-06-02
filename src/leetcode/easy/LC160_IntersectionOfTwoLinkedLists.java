package leetcode.easy;

public class LC160_IntersectionOfTwoLinkedLists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA = getLength(headA);
            int lenB = getLength(headB);
            int diff= lenA>lenB?(lenA-lenB):(lenB-lenA);
            ListNode ptA = headA;
            ListNode ptB = headB;
            if(lenB>lenA) {
                while (diff > 0) {
                    ptB = ptB.next;
                    diff--;
                }
            }
            else {
                while (diff > 0) {
                    ptA = ptA.next;
                    diff--;
                }

            }
            while( ptA!=null && ptB!=null){
                if(ptA==ptB){
                    return ptA;
                }
                ptA=ptA.next;
                ptB=ptB.next;
            }
            return null;
        }
        private int getLength(ListNode head){
           if(head==null){
               return 0;
           }
           return 1+getLength(head.next);
        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        ListNode intersect= new ListNode(8);
        intersect.next=new ListNode(4);
        intersect.next.next=new ListNode(5);


        ListNode node_1 = new ListNode(4);
        node_1.next=new ListNode(1);
        node_1.next.next=intersect;


        ListNode node_2 = new ListNode(5);
        node_2.next=new ListNode(6);
        node_2.next.next=new ListNode(1);
        node_2.next.next.next=intersect;

        ListNode ans = obj.getIntersectionNode(node_1,node_2);
        System.out.println("Answer: "+ans.val);

    }
}
