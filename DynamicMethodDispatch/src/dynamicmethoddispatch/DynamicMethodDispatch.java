package dynamicmethoddispatch;

/*
Dynamic Method Dispatch - Runtime polymorphism
Dynamically call a Method depends on object 

 */
class Super {

    public void meth1() {
        System.out.println("Super Method1");
    }

    public void meth2() {
        System.out.println("Super Method2");
    }
}

class Sub extends Super {

    @Override
    public void meth2() {
        System.err.println("Sub Method2");
    }

    public void meth3() {
        System.out.println("Sub Method3");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        Super sup = new Sub();

        sup.meth1(); 
        sup.meth2(); // Dynamic Method Dispatch //Dynamically call a Method depends on object 
        //sup.meth(); // not Allow

    }

}
