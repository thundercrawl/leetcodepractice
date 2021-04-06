
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

public class addTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cursor = head;
        Integer add =0;
        while(l1!=null||l2!=null||add==1)
        {
            cursor.val = (l1==null?0:l1.val)+(l2==null?0:l2.val)+add;
            if (cursor.val >=10)  
            {
                add = 1;
                cursor.val -= 10;
            }
            else 
            add = 0;
        
            if((l1!=null&&l1.next!=null)||(l2!=null&&l2.next!=null)||add ==1)
            {
                cursor.next =  new ListNode();
                cursor = cursor.next;
            }
            if(l1!=null)
            l1 = l1.next;
            if(l2!=null)
            l2 = l2.next;
        

        }

        return head;
    }
    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        Integer r = (l1==null?0:l1.val)+(l2==null?0:l2.val);
        r -=10;
        System.out.println(r);
    }

}