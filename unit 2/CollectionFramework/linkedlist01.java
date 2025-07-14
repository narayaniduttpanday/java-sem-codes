import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class linkedlist01{
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();

        list1.add("Ram");
        list1.add("Bharat");
        list1.add("Laxman");
        list1.add("Shatrughana");

        list1.addFirst("Shri Dashrath");
        list1.addLast("Kush");
        //till here size of the list is 6

        String nameFirst = list1.getFirst();
        String nameLast = list1.getLast();

        for(String items : list1){
            System.out.println(items);
            /*
            Shri Dashrath
            Ram
            Bharat
            Laxman
            Shatrughana
            Kush
            * */
        }

        list1.removeLast();
        //now the size of the list is 5

        System.out.println("The current size of the list is: "+list1.size());

        list1.addLast("Hanumant");

        for(String items : list1){
            System.out.println(items);
        }
         /*
            Shri Dashrath
            Ram
            Bharat
            Laxman
            Shatrughana
            Luv
            Kush
            * */

    }
}