import mypackage.Greet;
import mypackage.EnterDetails;

public class test{
    public static void main(String[] args) {
        Greet g1 = new Greet();
        EnterDetails e1 = new EnterDetails();
        g1.name = "Narayani Dutt Pandey";
        System.out.println(g1.name);
        g1.greetUser();


        e1.setAge(21);
        e1.setGender("Male");
        e1.setNationality("American");
        e1.setLanguages("English\nSpanish\nFrench\nGerman");

        e1.getAge();
        e1.getGender();
        e1.getNationality();
        e1.getLanguages();

//        g1.close();
//        e1.close();

    }
}
