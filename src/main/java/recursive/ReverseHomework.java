package recursive;

import java.math.BigInteger;

public class ReverseHomework {

  public static void main(String[] args) {
//    System.out.println("abc".substring(2,3));
    reverseDisplay("abcd");
    System.out.println(count("abcede", 'e'));
    System.out.println(sumDigits(12345));

    System.out.println(getCount("", 0));

  }

  public static void reverseDisplay(String value) {
    if (value.length() == 0) {
      return;
    }
    System.out.print(value.substring(value.length() - 1, value.length()));
    reverseDisplay(value.substring(0, value.length() - 1));

  }

  public static int count(String str, char a) {
    int counter = 0;
    if (str.length() == 0) {
      return 0;
    }
    if (str.charAt(str.length() - 1) == a) {
      counter += 1;
    }
    counter += count(str.substring(0, str.length() - 1), a);
    return counter;
  }

  public static int sumDigits(long n) {
    int sum = 0;
    if (n == 0) {
      return 0;
    }
    sum += n % 10;
    sum += sumDigits(n / 10);
    return sum;
  }

  public static void reverseDisplay(int value) {
    if (value > 0) {
      System.out.print(value % 10);
      reverseDisplay(value / 10);
    }
  }

  public static int findLargestNum(int[] arr, int i) {
    if (i == arr.length - 1) {
      return arr[i];
    }
    return Math.max(arr[i], findLargestNum(arr, i + 1));
  }

  public static int getCount(String s, int i) {
    if (i == s.length() - 1) {
      return 0;
    }
    int sum = 0;
    Character c = s.charAt(i);
    if (Character.isUpperCase(c)) {
      sum++;
    }
    return sum + getCount(s, i + 1);
  }

  private static BigInteger factorial(BigInteger n, BigInteger result) {
    if (n.equals(BigInteger.ZERO)) {
      return result;
    }
    return factorial(n.subtract(BigInteger.ONE), n.multiply(result));
  }

  public int gcd(int m, int n) {
    if (m % n == 0) {
      return n;
    }
    return gcd(n, m % n);
  }

  //  public int mi(int m){
//
//  }
  public static void displayPermutation(String s) {
    displayPermutation("", s);
  }

  public static void displayPermutation(String s1, String s2) {
    if (s2.length() == 0) {
      System.out.println(s1);
    }

    for (int i = 0; i < s2.length(); i++) {
      displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
    }
  }


}


