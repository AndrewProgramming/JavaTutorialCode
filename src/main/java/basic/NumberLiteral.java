package basic;

public class NumberLiteral {

  public static void main(String[] args) {

    System.out.println(1111);
    System.out.println(0b1111);// 15
    System.out.println(07777);//4095
    System.out.println(0XFFFF);// 65535

    long ssn = 232_45_4519;
    long creditCardNumber = 2324_4545_4519_3415L;

    System.out.println(232_45_4519 == 232454519);
  }

}
