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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = new int[] { -1, -1 };

        ListNode prev = head;
        ListNode curr = head.next;

         if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }

        int f=-1;
        int prC=-1;

        int p = 2;

        int minD= Integer.MAX_VALUE;
        while (curr.next != null) {

            ListNode next=curr.next;

            boolean isCr = (curr.val > prev.val && curr.val > next.val) ||
                    (curr.val < prev.val && curr.val < next.val);

                    if(isCr){
                        if(f==-1){
                            f=p;
                        }else{
                            minD=Math.min(minD,p-prC);
                        }
                        prC=p;
                    }

                   prev = curr;
                   curr = next;
                    p++;
        }
        if(f==-1 ||f==prC){
            return ans;
        }

        int maxD=prC-f;
      return new int[]{minD,maxD};

    }
}