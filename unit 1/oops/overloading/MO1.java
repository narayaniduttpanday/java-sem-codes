import java.io.*;
import java.util.Scanner;

class MO1{
    static int giveSum(int a , int b){
        return a+b;
    }
    static double giveSum(double a , double b){
        return a+b;
    }
    static float giveSum(float a , float b){
        return a+b;
    }

    public static void main(String args []){
        Scanner am = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = am.nextInt();
        System.out.print("Enter the value of b: ");
        int b = am.nextInt();

        System.out.println(MO1.giveSum(a , b));
        System.out.println(MO1.giveSum(a,b));
        float a1 = (float)(a);
        float b1 = (float)(b);
        System.out.println(MO1.giveSum(a,b));

        am.close();
    }
}