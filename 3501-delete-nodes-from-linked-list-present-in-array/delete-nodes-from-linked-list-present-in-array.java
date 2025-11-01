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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> hash = new HashSet<>();
        for(int n:nums){
            hash.add(n);
        }
        ListNode n = new ListNode(0);
        n.next = head;
        ListNode c = n;
        while(c.next!=null){
            if(hash.contains(c.next.val)){
                c.next =c.next.next;
            }
            else{
                c=c.next;
            }
        }
        return n.next;

    }
}