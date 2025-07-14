interface Shape {
    void area();
}

class Circle implements Shape {
    public void area() {
        System.out.println("Area of Circle");
    }
}

class Triangle implements Shape {
    public void area() {
        System.out.println("Area of Triangle");
    }
}

class Rectangle implements Shape {
    public void area() {
        System.out.println("Area of Rectangle");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Triangle();
        Shape s3 = new Rectangle();

        s1.area();
        s2.area();
        s3.area();
    }
}
