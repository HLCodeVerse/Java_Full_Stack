package Assignment_1;

public class Discount {
    public static void main(String[] args) {
        int amount=400;
        if (amount>500){
            System.out.println("20% discount");
        } else if (amount>100 && amount<=500) {
            System.out.println("10% discount");
        }else {
            System.out.println("no discount");
        }

    }
}
