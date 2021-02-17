package operator.math;

public class selfAddMinus {

  public static void main(String[] args) {
    int a = 3;//定义一个变量；
    int b = a++;//自增运算
    int c = 3;
    int d = c--;//自减运算
    System.out.println("进行自增运算后的值等于" + b);
    System.out.println("进行自减运算后的值等于" + d);
  }
}