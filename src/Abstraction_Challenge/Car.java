package Abstraction_Challenge;

public class Car extends ProductForSale {
    public Car(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beutifull reproduction");
        System.out.printf("The price of the piece is $%6.2f %n",price);
        System.out.println(description);
    }
}
