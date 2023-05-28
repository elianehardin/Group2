package GProjet2;

public class ShapeTester {

        // Testing the code

        public static void main(String[] args) {
            // Creating a circle
            Circle circle = new Circle(5.0);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            // Creating a square
            Square square = new Square(7.0);
            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Square Perimeter: " + square.calculatePerimeter());
        }


    }


