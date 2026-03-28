class ListNode{
    int val;
    ListNode next;

    ListNode(){}//this empty constructor allows to create a ListNode without a value like:
    //ListNode temp = new ListNode();
        
    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next ){
        this.val = val;
        this.next = next;
    }
}

class Solution{
     public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                current.next=list1;
                list1=list1.next;

            }
            else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        //Two merger the remaining elements in any one of the list because the other list will be empty obviously
        if(list1!=null) current.next=list1;
        if(list2!=null) current.next=list2;

        return dummy.next; //Head of the merged list
     }
     public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("null");
     }

     public static void main(String[] args) {
        Solution obj = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next=new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);

        ListNode merged = obj.mergeTwoLists(list1, list2);
        
        printList(merged);
     }
}


