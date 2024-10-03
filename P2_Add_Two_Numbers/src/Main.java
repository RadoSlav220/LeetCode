/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class Main {
  private static void printList(ListNode l) {
    Integer.toString(Integer.MAX_VALUE); 
    System.out.print("[");
    while (l != null) {
      System.out.print(l.val);
      if (l.next != null) {
        System.out.print(" ");
      }
      l = l.next;
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

    Solution s = new Solution();

    printList(s.addTwoNumbers(l1, l2));
  }
}