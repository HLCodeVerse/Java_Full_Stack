package Assignment_4.ZooManagementSystem;

import java.util.Scanner;

public class Bird extends Animal {
     Scanner sc = new Scanner(System.in);

    public Bird() {
        super("", "Bird");
    }

    @Override
    public void addAnimal() {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        setName(name);
    }
}
