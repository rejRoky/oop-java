package staticmembers;

/*
Static Variable
Static Method 
Static Nested Class
Static Blocks
 */
class Test {

    static int x = 10; //Static Variable
    int y = 20; //Non Static Variable

    void show() // Non Static Method  
    {
        System.out.println(x + " " + y);
    }

    static void display() // Static Method 
    {
        System.out.println(x);
    }
}

class Test2 {

    //Static Blocks
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}

public class StaticMembers {

    public static void main(String[] args) {

        Test.display(); // Can access with create object. Bcz Static member are belong with a class 

        Test t1 = new Test();
        t1.show();
        t1.x = 30;
        t1.y = 50;

        Test t2 = new Test();
        t2.show();

        // Static Blocks
        System.out.println("Main");
        Test2 T2 = new Test2();

    }
}
