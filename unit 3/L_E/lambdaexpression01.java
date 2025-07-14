import java.util.Scanner;

interface Message{
    void say();
}
class RunCode{

    public static void main(String[] args) {
        Message obj = () -> System.out.println("Hello World");
        obj.say();

    }
}