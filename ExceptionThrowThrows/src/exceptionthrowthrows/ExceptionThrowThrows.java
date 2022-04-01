package exceptionthrowthrows;

public class ExceptionThrowThrows {

    static int area(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception();
        }

        return a * b;

    }

    static void meth1() throws Exception {
        System.out.println(area(-10, 6));
    }

    static void meth2() throws Exception {
        meth1();
    }

    static void meth3() throws Exception {
        meth2();
    }

    public static void main(String[] args) throws Exception {
        try {
            meth3();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
