package objectandclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerAndBigDecimalDemo {

  public static void main(String[] args) {
    BigInteger a = new BigInteger("922337203685477580789898999999999999999999");
    BigInteger b = new BigInteger("2");
    BigInteger c = a.multiply(b); // 9223372036854775807 * 2
    System.out.println(c);


    BigDecimal a1 = new BigDecimal(1.0);
    BigDecimal b1 = new BigDecimal(3);
    BigDecimal c1 = a1.divide(b1, 200, BigDecimal.ROUND_DOWN);
    System.out.println(c1);

  }

}
