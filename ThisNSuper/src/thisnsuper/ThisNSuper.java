package thisnsuper;

public class ThisNSuper {

    public static void main(String[] args) {
        Cuboid c = new Cuboid(10, 5, 15);
        c.display();

    }

}

class Rectangle {

    int length;
    int breadth;
    int x = 8;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}

class Cuboid extends Rectangle {

    int height;
    int x = 256;

    Cuboid(int l, int b, int h) {
        super(l, b);
        this.height = h;
    }

    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}
