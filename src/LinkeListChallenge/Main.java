package LinkeListChallenge;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
class Place {
    private  String townName;
    private  int distance;

    public Place(String townName, int distance) {
        this.townName = townName;
        this.distance = distance;
    }

    public String getTownName() {
        return townName;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)",townName,distance);
    }
}
public class Main {
    public static void main(String[] args) {

        LinkedList<Place> place = new LinkedList<>();
        addPlace(place,new Place("Adelaide",1374));
        addPlace(place,new Place("Alice Spring",2771));
        addPlace(place,new Place("Brisbane",917));
        addPlace(place,new Place("Darwin",3972));
        addPlace(place,new Place("Melbourne",877));
        addPlace(place,new Place("Perth",3923));
        addPlace(place,new Place("Sydney",0));
        printString();
        var iterator = place.listIterator();
        Scanner input = new Scanner(System.in);
        boolean quitLoop =false;
        boolean forward = true;

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }

            try {
                System.out.print("Enter Value: ");
                String letter = input.nextLine().toUpperCase().substring(0,1);
                switch (letter) {
                    case "F" -> {
                        System.out.println("Users wants to go forward");
                        if(!forward){
                            forward = true;
                            if(iterator.hasNext()){
                                iterator.next();
                            }
                        }

                        if(iterator.hasNext()){
                            System.out.println(iterator.next());
                        }
                    }
                    case "B" ->{
                        System.out.println("Users wants to go Backward");
                        if(forward){
                            forward = false;
                            if(iterator.hasPrevious()){
                                iterator.previous();
                            }
                        }

                        if(iterator.hasPrevious()){
                            System.out.println(iterator.previous());
                        }
                    }
                    case "L" -> System.out.println(place);
                    case "M" -> printString();
                    default -> quitLoop = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter valid Character");
                input.next();
            }
        }

    }
    private static void addPlace(LinkedList<Place> lists, Place places){

        for(Place p : lists){
            if(p.getTownName().equalsIgnoreCase(places.getTownName())){
                System.out.println("Found duplicate: "+ places);
                return;
            }
        }

        int matchIndex = 0;
        for(var listPlace : lists){
            if(places.getDistance() < listPlace.getDistance()){
                lists.add(matchIndex, places);
                return;
            }
            matchIndex++;
        }

        lists.add(places);
    }
    private static void printString(){
        System.out.println(" \nAvailable actions (select word or letter):\n" +
                "  (F)orward \n" +
                "  (B)ackward \n" +
                "  (L)ist Places \n" +
                "  (M)enu \n" +
                "  (Q)uit");
    }
}
