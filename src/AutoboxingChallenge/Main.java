package AutoboxingChallenge;

import java.util.ArrayList;

class Customer {
    private String name;
    private ArrayList<Double> trx = new ArrayList<>();

    public Customer(String name, ArrayList<Double> trx) {
        this.name = name.toUpperCase();
        this.trx = trx;
    }

    public Customer(String name, double intialDeposit) {
        this(name.toUpperCase(), new ArrayList<>(500));
        trx.add(intialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setTrx(double trx) {
        this.trx.add(trx);
    }


    public ArrayList<Double> getTrx() {
        return trx;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", trx=" + trx +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("CBE");
        bank.addNewCustomer("Nati",10.0);
        bank.addTrx("Nati",200);
        bank.addTrx("Nati",-50);
        bank.printStatement("Nati");
    }

}

class Bank {
    private String name;
    private ArrayList<Customer> customer = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }
    public Customer findCustomer(String name) {
        for (var customers : customer) {
            if (customers.getName().equals(name.toUpperCase())) {
                return customers;
            }
        }
        System.out.printf("%nCustomer (%s) wasn't found %n", name);
        return null;
    }
    public void addNewCustomer(String name, double intialDeposit) {
        if (findCustomer(name) == null) {
            customer.add(new Customer(name, intialDeposit));
        }

    }
    public void addTrx(String name, double transactionAmount) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.setTrx(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            System.out.println("it is not availible");
            return;
        }
        System.out.println("_".repeat(30));
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Transaction:");
        for (double d : customer.getTrx()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }

    }
}

