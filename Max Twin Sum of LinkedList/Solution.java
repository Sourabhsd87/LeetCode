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
    public int pairSum(ListNode head) {
        int[] arr=new int[100000];
        int x=0;
        while(head!=null){
            arr[x] = head.val;
            head=head.next;
            x++;
        }
        int maxsum=0;
        for(int i=0;i<x/2;i++){
            int sum=arr[i]+arr[x-1-i];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum; 
    }
}
