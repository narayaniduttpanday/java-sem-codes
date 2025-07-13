import java.io.*;
import java.util.Scanner;

class Arrays{
    public static void main(String[] args) {
        //to enter and then print the names entered in the list:
        //let's say there are 10 names of the students:
        Scanner am = new Scanner(System.in);
        String names[] = new String[10];
        for(int i = 0;i<10;i++){
            System.out.println("Enter name"+(i+1)+": ");
            names[i] = am.nextLine();
        }
        System.out.println("The names of the ten students is: ");
        for(int i=0;i<10;i++){
            System.out.println(names[i]);
        }

        // printing the names of the students greater than a certain length
        for(int i = 0;i<10;i++){
            if(names[i].length() > 15 && names[i].length() < 20){
                System.out.println(names[i]);
            }
            else{
                continue;
            }
        }
    }
}