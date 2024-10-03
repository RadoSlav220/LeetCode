public class Solution {
  private ListNode reverse(ListNode prev, ListNode curr) {
    if (curr == null) {
      return prev;
    }

    ListNode temp = curr.next;
    curr.next = prev;
    return reverse(curr, temp);
  }

  private ListNode sum(ListNode revl1, ListNode revl2) {
    int firstDigitsSum = revl1.val + revl2.val;
    ListNode res = new ListNode(firstDigitsSum % 10);
    int onMind = firstDigitsSum / 10;
    revl1 = revl1.next;
    revl2 = revl2.next;

    while (revl1 != null || revl2 != null) {
      int digit1 = revl1 != null ? revl1.val : 0;
      int digit2 = revl2 != null ? revl2.val : 0;
      int digitSum = digit1 + digit2 + onMind;

      onMind = digitSum / 10;
      res = new ListNode(digitSum % 10, res);

      if (revl1 != null) {
        revl1 = revl1.next;
      }
      if (revl2 != null) {
        revl2 = revl2.next;
      }
    }

    if (onMind != 0) {
      res = new ListNode(onMind, res);
    }

    return reverse(null, res);
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return sum(l1, l2);
  }
}
