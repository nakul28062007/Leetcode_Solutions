//Defining Custom LinkedNode Class
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        next = null;
    }
}

class Solution{
    public ListNode addTwoNumbers(ListNode l1 , ListNode l2){
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum = carry;
            if(l1!=null){
                sum+=l1.data;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2 = l2.next;
            }
            carry = sum/10;
            sum = sum%10;

            ptr.next= new ListNode(sum);
            ptr=ptr.next;
        }
        if(carry>0){
            ptr.next=new ListNode(carry); 
        }
        return result.next;
    }
    public static void printList(ListNode node){
        while(node!=null){
            System.out.print(node.data);
            if(node.next!=null){
                System.out.print("->");
            }
            node = node.next;
        }
        System.out.println();
    }
    public static ListNode createList(int [] arr){
        if(arr==null||arr.length==0){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode curent = dummy;
        for( int data : arr){
                curent.next=new ListNode(data);
                curent=curent.next;
        }
        return dummy.next;
    }
     public static void main(String[] args){
        Solution obj = new Solution();
        ListNode l1 = createList(new int[]{2,4,3});
        ListNode l2 = createList(new int[]{5,6,4});
        printList(l1);
        printList(l2);
        ListNode sumList = obj.addTwoNumbers(l1, l2);
        printList(sumList);
}
}
