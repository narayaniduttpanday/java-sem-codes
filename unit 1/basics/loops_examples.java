import java.io.*;
import java.util.Scanner;

class loops{
    public void forLoops(int start, int num){
        System.out.println("Using for loops\n");
        //to print the table of the given number:
        if(start>0){
            for(int i=start;i<=10;i++)
                System.out.println(num+" x "+i+" = "+(num*i));
            }
        else {
            for(int i=start;i<10;i++){
                System.out.println(num+" x "+i+" = "+(num*i));
            }
        }
        }

        public void whileLoops(int start , int num){
            System.out.println("Using while loops");
            int i = start;
            if(i>0) {
                while (i <= 10){
                    System.out.println(num+" x "+i+" = "+(num*i));
                    i++;
            }
        }
            else{
                while(i<10){
                    System.out.println(num+" x "+i+" = "+(num*i));
                    i++;
                }
            }

    }
    public static void main(String args []){
        Scanner am = new Scanner(System.in);
        System.out.print("Enter the start point (NOTE: Must be a positive number: )");
        int start = am.nextInt();
        System.out.print("Enter the number whom you want to see the table: ");
        int end = am.nextInt();

        loops obj = new loops();
        obj.forLoops(start,end);
        obj.whileLoops(start,end);

        am.close();
    }
}