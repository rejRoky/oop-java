package exceptiontrycatch;

import java.util.Scanner;

public class ExceptionTryCatch {

    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number: ");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            c = a / b;
            System.out.println("Division Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("END");

        int A[] = {23, 3, 6, 5, 4};

        try {
            int x = A[0] / A[2];
            System.out.println(x);
            System.out.println(A[6]);

        } /// Mutiple Catch block
        catch (java.lang.ArithmeticException e) {

            System.out.println(e);

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
        }

        /// Nested try and catch block
        try {
            int x = A[0] / A[2];
            System.out.println(x);

            try {

                System.out.println(A[6]);

            } catch (java.lang.ArrayIndexOutOfBoundsException e) {

                System.out.println(e);
            }

        } catch (java.lang.ArithmeticException e) {

            System.out.println(e);
        }

    }

}
