package circle1;

public class Circle1 {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = 10.5;
        System.out.printf("Area: %.2f\n" , c1.areaOfCircle());
        System.out.printf("Area: %.2f\n" , c1.perimeterOfCircle());
        System.out.printf("Area: %.2f\n" , c1.circumferenceOfCircle());
        
        c2.radius = 10;
        System.out.printf("Area: %.2f\n" , c2.areaOfCircle());
        System.out.printf("Area: %.2f\n" , c2.perimeterOfCircle());
        System.out.printf("Area: %.2f\n" , c2.circumferenceOfCircle());

    }

}

class Circle {

    public double radius;

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
