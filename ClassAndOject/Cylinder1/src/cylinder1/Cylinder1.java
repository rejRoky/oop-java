package cylinder1;

public class Cylinder1 {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.height = 2.5;
        c1.radius = 3.6;

        System.out.printf("LidArea: %.2f\n", c1.lidArea());
        System.out.printf("Total Surface Area: %.2f\n", c1.totalSurfaceArea());
        System.out.printf("Volume: %.2f\n", c1.volume());

    }

}

class Cylinder {

    public double radius;
    public double height;

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
