package recursive;

public class Hex2Dec {

//  public static int hex2Dec(String hexString) {
//
//  }

  private static int getDecimalValue(char hexChar) {
    if (Character.isDigit(hexChar)) {
      return Integer.parseInt(String.valueOf(hexChar));
    }

    int digit = 0;
    switch (hexChar) {
      case 'a':
        digit = 10;
        break;
      case 'b':
        digit = 11;
        break;
      case 'c':
        digit = 12;
        break;
      case 'd':
        digit = 13;
        break;
      case 'e':
        digit = 14;
        break;
      case 'f':
        digit = 15;
    }

    return digit;
  }
}
