import java.util.ArrayList;
import java.util.Collections;

public class cf01{
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();

        arraylist.add("Narayani Dutt Pandey");
        arraylist.add("Prashant Mishra");
        arraylist.add("Vikash Mishra");
        arraylist.add("Samyak Kumar Singh");
        arraylist.add("Navneet Tiwari");

        System.out.println("The size of the list is: "+ arraylist.size());
        System.out.println("Does arraylist contains the name Shivam"+arraylist.contains("Shivam"));


        for(String items : arraylist){
            System.out.println(items);

        }

    }
}