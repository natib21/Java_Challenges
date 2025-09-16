package Abstraction_Challenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale products) {

}
public class Store {

    private static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new Car("Marcedis", 20000, "Nice Germany car"));
        products.add(new Car("Ford", 2000000, "Nice American car"));
        products.add((new Water("Spring", 100, "Natural Miniral Water ")));
        products.add((new Water("Ground", 150, "Natural under ground water ")));

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void addItemToOrder(ArrayList<OrderItem> orders, int orderIndex, int qty) {
        orders.add(new OrderItem(qty, products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> orders) {
        double salesTotal = 0;
        for (var item : orders) {
            item.products().printPricedItem(item.qty());
            salesTotal += item.products().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n ", salesTotal);
    }

}
