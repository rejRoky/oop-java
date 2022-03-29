package methodoverriding;

class Super {

    public void display() {
        System.out.println("this is super class");
    }
}

class Sub extends Super {

    @Override  /// method overrided 
    public void display() {
        System.out.println("this is Sub class");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Super su = new Super(); 
        Sub sb = new Sub(); /// method overrided 

        su.display();
        sb.display();

    }

}
