import java.util.Scanner;

public class MO{
    int giveSum(int a , int b ){
        int sum = a+b;
        return sum;
    }
    int giveSum(int a , int b , int c ){
        int sum = a+b+c;
        return sum;
    }

    int giveSum(int a , int b , int c , int d){
        return (a+b+c+d);
    }

    public static void main(String args []){
        Scanner am = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int value1 = am.nextInt();
        System.out.print("Enter the value of b: ");
        int value2 = am.nextInt();
        System.out.print("Enter the value of c: ");
        int value3 = am.nextInt();
        System.out.print("Enter the value of d: ");
        int value4 = am.nextInt();

        MO obj = new MO();
        System.out.println("Sum of two values is: "+obj.giveSum(value1 , value2));
        System.out.println("Sum of three values is: "+obj.giveSum(value1 , value2 , value3));
        System.out.println("Sum of four values is: "+ obj.giveSum(value1,value2,value3,value4));

        am.close();
    }
}