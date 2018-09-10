package Algorithm;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            ListNode ln = new ListNode((l1.val < l2.val) ? l1.val : l2.val);
            ln.next = (l1.val < l2.val) ? mergeTwoLists(l1.next, l2) : mergeTwoLists(l1, l2.next);
            return ln;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mt = new MergeTwoSortedLists();
    }
}
