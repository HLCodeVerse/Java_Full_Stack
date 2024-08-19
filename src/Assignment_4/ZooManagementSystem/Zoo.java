package Assignment_4.ZooManagementSystem;

import java.util.Scanner;

public class Zoo {
   static Scanner sc = new Scanner(System.in);
  private static Mammal m = new Mammal();
  private static Bird b = new Bird();
  private static Reptile r = new Reptile();

  public static void main(String[] args) {
    int ch;
    do {
      System.out.println("1. Add Mammal");
      System.out.println("2. Add Bird");
      System.out.println("3. Add Reptile");
      System.out.println("4. Display Animals");
      System.out.println("5. Remove Animal");
      System.out.println("6. Exit");
      ch = sc.nextInt();
      sc.nextLine();
      switch (ch) {
        case 1:
          m.addAnimal();
          break;
        case 2:
          b.addAnimal();
          break;
        case 3:
          r.addAnimal();
          break;
        case 4:
          displayAnimals();
          break;
        case 5:
          removeAnimal();
          break;
        case 6:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice");
      }
    } while (ch != 6);
  }

  private static void displayAnimals() {
    System.out.println("Animals in the zoo :");
    if (m.getName() != null) {
      System.out.println(m.getName ());
    }
    if ( b.getName() != null) {
      System.out.println(b.getName ());
    }
    if (r.getName() != null) {
      System.out.println(r.getName ());
    }
  }

  private static void removeAnimal() {
    System.out.println("Enter the type of the animal to remove (mammal/bird/reptile):");
    String type = sc.nextLine();
    switch (type) {
      case "mammal":
        m.setName(null);
        break;
      case "bird":
        b.setName(null);
        break;
      case "reptile":
        r.setName(null);
        break;
      default:
        System.out.println("Invalid type");
    }
    System.out.println("Animal removed");
  }
}
