/*
final variable 
final method
final class

 */
package finalmember;

class Test {

    public final void show() //final Method 
    {
        System.out.println();
    }
}

class Test1 extends Test {
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class FinalMember {

    public static void main(String[] args) {

        final float PI; //final variable 
        PI = 3.1425f;
        System.out.println(PI);

    }

}
