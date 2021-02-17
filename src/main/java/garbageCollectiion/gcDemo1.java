package garbageCollectiion;

public class gcDemo1 {
    public static void main(String args[]) {
        /* Here we are intentionally assigning a null
         * value to a reference so that the object becomes
         * non reachable
         */
        gcDemo1 obj = new gcDemo1();
        obj = null;

        /* Here we are intentionally assigning reference a
         * to the another reference b to make the object referenced
         * by b unusable.
         */
        gcDemo1 a = new gcDemo1();
        gcDemo1 b = new gcDemo1();
        b = a;
        System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is performed by JVM");
    }

}
