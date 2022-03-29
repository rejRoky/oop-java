package abstractclassnmethod;

abstract class Shape { // Abstract Class

    abstract double area();

    abstract double perimeter(); // Abstract Method
}

class Circle extends Shape {

    private double radius;

    Circle() {
        this.radius = 0;

    }

    Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double circumference() {
        return perimeter();
    }

}

class Rectangle extends Shape {

    protected double length;
    protected double breadth;

    Rectangle() {
        this.breadth = 0;
        this.length = 0;

    }

    Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;

    }

    @Override
    public double area() {
        return this.length * this.breadth;

    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.breadth);

    }

}

public class AbstractClassNMethod {

    public static void main(String[] args) {
        Shape sc = new Circle(5.6);
        Shape sr = new Rectangle(1.2, 12.2);

        System.out.printf("Area of Circle : %.2f\n", sc.area());
        System.out.printf("Perimeter of Circle : %.2f\n\n", sc.perimeter());

        System.out.printf("Area of Rectanle : %.2f\n", sr.area());
        System.out.printf("Perimeter of Rectanle : %.2f\n", sr.perimeter());

    }

}
