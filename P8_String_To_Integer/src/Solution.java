public class Solution {
  private boolean isDigit(char c) {
    return c >= '0' && c <= '9';
  }

  private int charToDigit(char c) {
    return c - '0';
  }

  public int myAtoi(String s) {
    boolean isNegative = false;
    int result = 0;
    int it = 0;

    s = s.trim();

    if (s.isEmpty()) {
      return 0;
    }

    if (s.charAt(it) == '-' || s.charAt(it) == '+') {
      isNegative = s.charAt(it) == '-';
      it++;
    }

    while (it < s.length() && isDigit(s.charAt(it))) {
      int newDigit = charToDigit(s.charAt(it));

      if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && newDigit > Integer.MAX_VALUE % 10)) {
        return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }
      result = result * 10 + newDigit;
      it++;
    }

    return isNegative ? -result : result;
  }
}
