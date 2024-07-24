package day2;

class Shape {
    // Calculates the area of a rectangle or square
    public int area(int length, int breadth) {
        return length * breadth;
    }

    // Calculates the area of a circle
    public float area(int radius) {
        return 3.14f * radius * radius;
    }

    // Calculates the area of a triangle
    public float area(float base, float height) {
        return 0.5f * base * height;
    }
}

public class CompiletimePolymorphism {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("Area of Rectangle/Square: " + s1.area(10, 10));
        System.out.printf("Area of Circle: %.3f%n", s1.area(7));
        System.out.println("Area of Triangle: " + s1.area(2.0f, 4.0f));
    }
}
