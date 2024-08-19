package Assignment_4.ZooManagementSystem;

public abstract class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void addAnimal();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
