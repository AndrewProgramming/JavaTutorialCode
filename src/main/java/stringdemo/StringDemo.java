package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        System.out.println(stringDemo.toString());

        String s = new String("Andrew Programming!");

        System.out.println("s:" + s);

        char[] chars = {'J', 'A', 'V', 'A'};     //Character Array
        String s1 = new String(chars);    //Creating a String object by passing character array as an argument
        System.out.println("s1:" + s1);

        String s11 = new String(chars, 2, 2);
        System.out.println("s11:" + s11);


        StringBuffer strBuff = new StringBuffer("abc");
        String s2 = new String(strBuff);   //Creating a string object by passing StringBuffer type as an argument
        System.out.println("s2:" + s2);


        StringBuilder strBldr = new StringBuilder("s builder");
        String s3 = new String(strBldr);   //Creating a string object by passing StringBuilder type as an argument.
        System.out.println("s3:" + s3);

        String s5 = "abc";

        String s6 = "abc" + "def";

        String s7 = "123" + "A" + "B";

        System.out.println(s5);     //Output : abc

        System.out.println(s6);     //Output : abcdef

        System.out.println(s7);     //Output : 123AB


    }
}
