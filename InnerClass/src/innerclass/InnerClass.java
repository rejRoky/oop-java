package innerclass;

/// Nested Inner Class
class Outer {

    int x = 10;

    class Inner {

        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);

        }
    }
    Inner i = new Inner();

    public void outerDisplay() {
        i.innerDisplay();
        System.out.println(i.y);

    }
}

public class InnerClass {

    public static void main(String[] args) {

        /// Nested innder class
        Outer o = new Outer();
        o.outerDisplay();

        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

    }

}
