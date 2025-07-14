import java.io.*;
import java.util.Collections;
import java.util.Stack;

public class GenericStack {
    public static void main(String[] args) {
        Stack fs = new Stack(); //Generic Stack is created , i.e. it can store data of all types
        fs.push(10);
        fs.push("Narayani");
        fs.push(26.90f);
        fs.push('a');
        fs.push("True");

        while(!fs.isEmpty()){
            System.out.println(fs.pop());
        }
        /*
        True
        * a
        * 26.90
        * Narayani
        * 10
        * */
    }
}
