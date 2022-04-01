package exceptionthrowthrows;

class NegativeDimensionException extends Exception {

    @Override
    public String toString() {
        return "Dimension of Reatangle cannot be Negative";

    }
}

public class ExceptionThrowThrows {

    static int area(int a, int b) throws NegativeDimensionException {
        if (a < 0 || b < 0) {
            throw new NegativeDimensionException();
        }

        return a * b;

    }

    static void meth1() throws NegativeDimensionException {
        System.out.println(area(-10, 6));
    }

    static void meth2() throws NegativeDimensionException {
        meth1();
    }

    static void meth3() throws NegativeDimensionException {
        meth2();
    }

    public static void main(String[] args) throws NegativeDimensionException {
        try {
            meth3();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }

}
