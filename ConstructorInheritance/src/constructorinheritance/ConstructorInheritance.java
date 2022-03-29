package constructorinheritance;

public class ConstructorInheritance {

    public static void main(String[] args) {
        Cuboid c=new Cuboid(25,33,1.30);
        System.out.println("Volume : "+c.volume());

    }

}

class Rectangle {

    double length;
    double breath;

    Rectangle() {
        length = breath = 1;

    }

    Rectangle(double l, double b) {
        length = l;
        breath = b;

    }
}

class Cuboid extends Rectangle {

    double height;

    Cuboid() {
        height = 1;
    }

    Cuboid(double h) {
        height = h;
    }

    Cuboid(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breath * height;
    }
}
