package 领扣算法.AA中等题.two;

public class Solution {
public static void main(String arg[]){//main--来自高金磊

 System.out.println(new Solution().lengthOfLongestSubstring("abcabc"));
}
    public int lengthOfLongestSubstring(String s) {
        int max=s.length()==0?0:1;
        ListNode head=null;
        ListNode r=null;
        for (char c:s.toCharArray()) {
            if (head==null){
                r=head=new ListNode(c);
                continue;
            }


            ListNode end=new ListNode(c);
            r=head;
            while (r.next!=null){
                if (c==r.val){
                    head=r.next==null?end:r.next;//截断
                }
               r=r.next;
            }
            if (c==r.val){//这已经是最后一个了
                head=r=end;
                continue;
            }

            r.next=end;
            max=Math.max(max, head.getsize());
        }


        return max;
    }

    class ListNode{
        ListNode next;
        char val;
        ListNode(char val){
            this.val=val;
        }
       int getsize(){
            int size=1;
            ListNode r=next;
            while (r!=null){
                size++;
                r=r.next;
            }
            return size;
       }
    }
}
