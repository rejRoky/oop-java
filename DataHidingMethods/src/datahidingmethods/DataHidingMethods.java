package datahidingmethods;

public class DataHidingMethods {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.setLength(-2.36);
        r1.setBreadth(2.25);

        System.out.printf("Length: %.2f\n", r1.getLength());
        System.out.printf("Breadth: %.2f\n", r1.getBreadth());
        System.out.printf("Area : %.2f\n", r1.areaOfRectangle());
        System.out.printf("Perimeter: %.2f\n", r1.perimeterOfRectangle());

    }

}

class Rectangle {

    private double length;
    private double breadth;

    public double getLength() {
        return length;

    }

    public void setLength(double l) {
        if (l > 0) {
            length = l;
        } else {
            length = 0;
        }

    }

    public double getBreadth() {
        return breadth;

    }

    public void setBreadth(double b) {
        if (b > 0) {
            breadth = b;
        } else {
            breadth = 0;
        }

    }

    public double areaOfRectangle() {
        return length * breadth;

    }

    public double perimeterOfRectangle() {
        return 2 * (length + breadth);

    }

}
