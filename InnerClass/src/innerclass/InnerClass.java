package innerclass;

///Anonimus class
interface My {

    void show();
}

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

    ////
    public void Display() {

        ///Local Inner class
        class Inner {

            public void Show() {
                System.out.println("Local Inner");
            }

        }
        Inner i = new Inner();
        i.Show();

        new Inner().Show(); // Anonimus Object// this obj only use for this line 

        ////
    }

    ///Anonimus class
    public void display() {
        new My() {
            @Override
            public void show() {
                System.out.println("Annonimus Inner class");
            }
        }.show(); /// Anonimus Object// this obj only use for this line

    }
}

public class InnerClass {

    public static void main(String[] args) {

        /// Nested innder class
        Outer o = new Outer();
        o.outerDisplay();

        /// Nested innder class  : direetly access
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

        ///Local Inner class
        o.Display();

        ///Anonimus class
        o.display();

    }

}
