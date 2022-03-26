package constructors;

public class Constructors {

    public static void main(String[] args) {

        // Cylinder c1 = new Cylinder();  // Default Constructors call auto by java compilar 
        Cylinder c1 = new Cylinder(12, -3.2); /// Constructors call

        System.out.printf("LidArea: %.2f\n", c1.lidArea());
        System.out.printf("Total Surface Area: %.2f\n", c1.totalSurfaceArea());
        System.out.printf("Volume: %.2f\n", c1.volume());

    }

}

class Cylinder {

    public double radius;
    public double height;

    public Cylinder() {   /// Constructors : perameterless 
        radius = 0;
        height = 0;

    }

    public Cylinder(double r, double h) { /// Constructors with perameter
        if (r > 0 && h > 0) {
            radius = r;

            height = h;
        } else {
            radius = 0;
            height = 0;
        }

    }

    public double lidArea() {
        return areaOfCircle();
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumferenceOfCircle() * height;

    }

    public double volume() {
        return lidArea() * height;
    }

    public double areaOfCircle() {
        return Math.PI * radius * radius;
    }

    public double perimeterOfCircle() {
        return 2 * Math.PI * radius;
    }

    public double circumferenceOfCircle() {
        return perimeterOfCircle();
    }

}
