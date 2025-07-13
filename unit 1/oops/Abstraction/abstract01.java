abstract class Shapes{
    abstract void Draw();

}

class Circle extends Shapes{
     void Draw(){
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shapes{
     void Draw(){
        System.out.println("Drawing a Rectangle");
    }
}

class Square extends Rectangle{
     void Draw(){
        System.out.println("Drawwing a Square");
    }
}

public class abstract01{
    public static void main(String args [])
    {
        Circle obj = new Circle();
        Square obj1 = new Square();
        Rectangle obj2 = new Rectangle();


        obj.Draw();
        obj2.Draw();
        obj1.Draw();

    }
}