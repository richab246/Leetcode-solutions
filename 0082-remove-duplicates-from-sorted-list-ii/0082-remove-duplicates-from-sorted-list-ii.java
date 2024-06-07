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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newList = new ListNode(-1);
        newList.next = head;
        ListNode temp = newList;

        while(head!=null){
          if(head.next!=null && head.val == head.next.val){
            while(head.next!=null && head.val == head.next.val){
                head = head.next;
            }
            temp.next = head.next;
          }else{
            temp = temp.next;
          }  
          head = head.next;
        }
        return newList.next;
    }
}