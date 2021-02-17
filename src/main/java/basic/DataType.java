package basic;


public class DataType {

    int i1;
    float f1;
    double d1;
    short s1;
    byte bte1;
    char c1;
    boolean booleanType;
    long l1;


    public static void main(String[] args) {
        int i = 0;
        long l = 1000_0000_0000_000L;
        double d = 4.0D;

        double d1 = 123.4d;
        double d2 = 1.234e2d;


        float f1 = 34.21F;

        int i1 = 344_562_89;

        int hexInt = 0x26;
        int binInt = 0b0001;

        System.out.println("i=" + i);
        System.out.println("l=" + l);
        System.out.println("d=" + d);

        System.out.println("d1=" + d1);
        System.out.println("d2=" + d2);
        System.out.println("f1=" + f1);

        System.out.println("i1=" + i1);

        System.out.println("hexInt=" + hexInt);
        System.out.println("binInt=" + binInt);


        char c = '\u0041';
        char c1 = '\u0061';
        System.out.println("c=" + c);
        System.out.println("c1=" + c1);

        boolean b = true;
        System.out.println("b=" + b);

        short s = 1000;
        byte bte = 100;

        System.out.println("short=" + s);
        System.out.println("byte=" + bte);


        System.out.println("------------------");

        DataType dataType = new DataType();
        dataType.showDefaultValue();


    }


    public void showDefaultValue() {
        System.out.println(i1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(s1);
        System.out.println(bte1);
        System.out.println(c1);
        System.out.println(booleanType);
        System.out.println(l1);
    }

}
