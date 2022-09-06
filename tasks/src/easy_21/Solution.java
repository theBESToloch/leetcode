package easy_21;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        int i = 0;
        int[] ints = new int[100];

        int val1 = list1.val;
        int val2 = list2.val;

        while (true) {
            if (val1 >= val2) {
                ints[i] = val2;
                i++;
                list2 = list2.next;
                if (list2 == null) break;
                val2 = list2.val;
            } else {
                ints[i] = val1;
                i++;
                list1 = list1.next;
                if (list1 == null) break;
                val1 = list1.val;
            }
        }
        ListNode remains = list1 != null ? list1 : list2;
        do{
            ints[i] = remains.val;
            i++;
        }
        while ((remains = remains.next) != null);

        ListNode finalList = null;
        for (i--; i > -1; i--){
            finalList = new ListNode(ints[i], finalList);
        }

        return finalList;
    }

    public static void main(String[] args) {

        int[] ints1 = new int[]{1,2,4};
        int[] ints2 = new int[]{1,3,4};

        Solution s = new Solution();

        ListNode listNode1 = getListNode(ints1);
        ListNode listNode2 = getListNode(ints2);

        ListNode listNode = s.mergeTwoLists(listNode1, listNode2);
        System.out.println("ffafa");
    }

    private static ListNode getListNode(int[] ints) {
        ListNode l = null;

        for (int i = ints.length - 1; i > -1; i--){
            l = new ListNode(ints[i], l);
        }
        return l;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
