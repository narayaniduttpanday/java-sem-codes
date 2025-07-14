import java.util.*;

class Run{
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);

        Stack<String> stk = new Stack<>();

        boolean choice = true;
        while(choice){
            System.out.println("Enter the name: ");
            String name = am.nextLine();
            stk.push(name);
            System.out.print("Still want to enter any name: ");
            String ans = am.nextLine();
            choice = ans.equalsIgnoreCase("Y");
        }
        System.out.println();

        System.out.println("The names in the stack is: ");
        System.out.println();
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
    }
}