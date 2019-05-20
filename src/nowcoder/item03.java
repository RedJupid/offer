package nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class item03 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> s = new Stack<>();
        ListNode cur = listNode;
        while (cur!=null){
            s.push(cur.val);
            cur = cur.next;
        }
        List<Integer> l = new ArrayList<>();
        while(!s.empty()){
            l.add(s.pop());
        }
        return (ArrayList<Integer>) l;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode cur = l;
        for (int i=2;i<10;i++){
            ListNode ln = new ListNode(i);
            cur.next = ln;
            cur = ln;
        }
        System.out.println(printListFromTailToHead(l));
    }
}
