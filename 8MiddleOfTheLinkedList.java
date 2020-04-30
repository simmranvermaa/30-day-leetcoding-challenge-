/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode start=head;
        int n=0;
        while(start!=null){
            start=start.next;
            n+=1;
        }
        //System.out.println(n);
        start=head;
        int i=0;
        while(i<n/2)
        {start=start.next;
        i+=1;}
        return start;
        
    }
}
