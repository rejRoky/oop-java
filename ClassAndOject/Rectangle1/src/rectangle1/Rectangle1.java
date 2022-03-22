package rectangle1;

public class Rectangle1 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.breadth = 3.2;
        r1.length = 5;

        System.out.printf("Area : %.2f\n", r1.areaOfRectangle());
        System.out.printf("Perimeter: %.2f\n", r1.perimeterOfRectangle());

        r2.breadth = 3;
        r2.length = 6;

        System.out.printf("Area : %.2f\n", r2.areaOfRectangle());
        System.out.printf("Perimeter: %.2f\n", r2.perimeterOfRectangle());

    }

}

class Rectangle {

    public double length;
    public double breadth;

    public double areaOfRectangle() {
        return length * breadth;

    }

    public double perimeterOfRectangle() {
        return 2 * (length + breadth);

    }

}
