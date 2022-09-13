package easy_83;

// 1 - 1 - 2 - 3 - 3
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int curValue = head.val;

        ListNode last = head;
        ListNode next = head;
        while ((next = next.next) != null) {
            if (curValue == next.val) {
                last.next = null;
            } else {
                last.next = next;
                last = next;
                curValue = next.val;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a5 = new ListNode(3);
        ListNode a4 = new ListNode(3, a5);
        ListNode a3 = new ListNode(2, a4);
        ListNode a2 = new ListNode(1, a3);
        ListNode a1 = new ListNode(1, a2);

        ListNode listNode = solution.deleteDuplicates(a1);
        System.out.println("fsdfsf");
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}