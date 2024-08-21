package Car;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinder,String name){
        this.cylinders=cylinder;
        this.name = name;
        engine = true;
        wheels =4 ;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String  brake(){
        return "Car -> brake()";
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
}
 class Mitsubishi extends Car {

    public Mitsubishi (int cylinder,String name){
        super(cylinder,name);
    }

    @Override
    public String  startEngine(){
        return "Mitsubishi -> startEngine()";
    }
    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }

    // write code here
}
class Holden extends Car {
    // write code here

    public Holden(int cylinder,String name){
        super(cylinder,name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }
}
class Ford extends Car {
    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}