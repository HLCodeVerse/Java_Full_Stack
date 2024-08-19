package Assignment_4.ZooManagementSystem;

import java.util.Scanner;

public class Mammal extends Animal {
     Scanner sc = new Scanner(System.in);

    public Mammal() {
        super("", "Mammal");
    }

    @Override
    public void addAnimal() {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        setName(name);
    }
}
