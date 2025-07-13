import java.io.*;

class Employee{
    float salary = 40000.495F;

}
class Programmer extends Employee{
    int bonus = 10000;

}

public class BillingSalary{
    public static void main(String[] args) {
        Programmer obj = new Programmer();
        float totalAmount = obj.salary+obj.bonus;
        System.out.print("The salary of the programmer is: " + obj.salary+"\n");
        System.out.print("The Bonus of the programmer is: " + obj.bonus+"\n");
        System.out.print("The total billing amount of the employee is: "+totalAmount);
    }
}