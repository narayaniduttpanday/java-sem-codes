import java.io.*;
import java.util.Scanner;

class ParentClass{
    public static int  performOperation(int a , int b){
        return (a+b);
        //method for adding two variables and return their sum
    }
}

class ChildrenClass extends ParentClass{
    public static int performOperation(int a , int b){
        return (a-b);
    }
    public static int performOperation(int a , int b , int c){
        return (a*b*c);
    }
    public static int performOperation(int a , int b){
        int next =  a << 2;
        return (next+b);

    }
    public static int performOperation(int a,int b){
        int  next = b << 3;
        return (next+a);
    }

}

public class Mo1{
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.println("Enter the value for the first variable: ");
        int a = am.nextInt();

        System.out.println("Enter the value for the second variable: ");
        int b = am.nextInt();

        System.out.println(ChildrenClass.performOperation(a,b));
        System.out.println(ChildrenClass.performOperation(a,b,5));
        System.out.println(ChildrenClass.performOperation(a,78));
        System.out.println(ChildrenClass.performOperation(55,b));

        am.close();


    }
}