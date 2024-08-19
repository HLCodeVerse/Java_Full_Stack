package Assignment_4.ZooManagementSystem;

import java.util.Scanner;

public class Reptile extends Animal {
    private Scanner sc = new Scanner(System.in);

    public Reptile() {
        super("", "Reptile");
    }

    @Override
    public void addAnimal() {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        setName(name);
    }
}
