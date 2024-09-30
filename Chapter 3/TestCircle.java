public class TestCircle {

    public static void main(String[] args) {
        // Creating Circle objects a, b, and c
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        // Setting radius of first circle to 3 and printing details
        a.setRadius(3);
        System.out.println("Circle a:");
        System.out.println("Radius: " + a.getRadius());
        System.out.println("Diameter: " + a.getDiameter());
        System.out.println("Area: " + a.getArea());

        // Setting radius of second circle to 20 and printing details
        b.setRadius(20);
        System.out.println("\nCircle b:");
        System.out.println("Radius: " + b.getRadius());
        System.out.println("Diameter: " + b.getDiameter());
        System.out.println("Area: " + b.getArea());
    }
}
