package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.height = 2.5;
        c1.radius = 3.6;

        System.out.printf("LidArea: %.2f\n", c1.lidArea());
        System.out.printf("Total Surface Area: %.2f\n", c1.totalSurfaceArea());
        System.out.printf("Volume: %.2f\n", c1.volume());

    }

}

class Circle {

    public double radius;

    Circle() {
        radius = 0;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}

class Cylinder extends Circle { /// Cylinder class is inheritances from Circle class 

    public double height;

    Cylinder() {
        height = 0;
    }

    public double lidArea() {
        return area();
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;

    }

    public double volume() {
        return lidArea() * height;
    }

    public double areaOfCircle() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }

}
