import java.io.*;
import java.util.*;
import java.lang.*;

public class EH02 {

     int findSum(int a, int b) {
        return (a + b);
    }

     int findDifference(int a, int b) {
        return (a - b);
    }

     int findProduct(int a, int b) {
        return (a * b);
    }

     int findQuotient(int a, int b) throws ArithmeticException {
        return (a / b);
    }

    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = am.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = am.nextInt();

        EH02 obj = new EH02();

        System.out.println(obj.findSum(num1, num2));
        System.out.println(obj.findDifference(num1, num2));
        System.out.println(obj.findProduct(num1, num2));

        try {
            System.out.println(obj.findQuotient(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("division by zero is not allowed in Mathematics, please re-enter b" + e.getMessage());
        } finally {
            System.out.println("Code Completed Executing");
        }

    }
}