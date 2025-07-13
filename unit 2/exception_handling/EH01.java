import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class EH01{
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);

        System.out.print("Enter the first variable: ");
        int num1 = am.nextInt();

        System.out.println("Enter the second variable: ");
        int num2 = am.nextInt();
        System.out.println("Sum is: "+(num1+num2));
        System.out.println("Difference is: "+(num1-num2));
        System.out.println("Product is: "+(num1+num2));

        try{
            int div = num1/num2;
            System.out.println("Quotient is: "+div);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed!");
        }
        finally{

            System.out.println("Programm execution finished");

        }
    }
}