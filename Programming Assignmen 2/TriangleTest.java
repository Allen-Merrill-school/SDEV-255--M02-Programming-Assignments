import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get user input
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = input.nextBoolean();

        //Create triangle 
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        //Output resutls
        System.out.println("\nTriangle Information:");
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

        input.close();
    }
}

//GeometricObject class
//Had to change class around due to debugging issues
class GeometricObject {
    private String color;
    private boolean filled;

    //No-arg constructor
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    //Constructor with specified color and filled status
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Filled: " + filled;
    }
}

//Triangle class
class Triangle extends GeometricObject {
    //Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle.
    private double side1;
    private double side2;
    private double side3;

    //A no-arg constructor that creates a default triangle.
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    //A constructor that creates a triangle with the specified side1, side2, and side3.
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    //A method named getArea() that returns the area of this triangle.
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //A method named getPerimeter() that returns the perimeter of this triangle.
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    //A method named toString() that returns a string description for the triangle
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 +
                ", side3 = " + side3;
    }
}
