import java.util.Scanner;

class Animal {

    String name;
    String voreType;
    String breed;
    String color;

    // Setters
    public void setVoreType(String voreType) {
        this.voreType = voreType;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getters
    public String getVoreType() {
        return voreType;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void AnimalSound(String breed) {
        if (breed.equals("Dog")) {
            System.out.println("Bhow Bhow \nBhow Bhow");
        } else if (breed.equals("Cat")) {
            System.out.println("Meow Meow \nMeow Meow");
        } else if (breed.equals("Cow")) {
            System.out.println("Moah Moah \nMoah Moah");
        } else {
            System.out.println("Animal Breed Type Not Found, please retry!");
        }
    }
}


public class classes_sample {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Scanner am = new Scanner(System.in);

        System.out.print("Enter the type of the animal: ");
        obj.setVoreType(am.nextLine());

        System.out.print("Enter the breed of the animal: ");
        String breed = am.nextLine();
        obj.setBreed(breed);

        System.out.print("Enter the name of the animal: ");
        obj.setName(am.nextLine());

        System.out.print("Enter the color of the animal: ");
        obj.setColor(am.nextLine());

        System.out.println("\nPlease verify the pet details:\n");

        System.out.println("The pet is " + obj.getVoreType() + " in nature.");
        System.out.println("The pet is a " + obj.getBreed());
        System.out.println("The pet's name is " + obj.getName());
        System.out.println("The pet's color is " + obj.getColor());

        System.out.println("\nThe sound of the pet is:");
        obj.AnimalSound(breed);

        am.close();
    }
}
