// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Bird bird = new Bird();
       Animal animal = bird;
       FlightEnabled flier = bird;
       Trackable tracked = bird;

       animal.move();
       inFligt(flier);
       inFligt(new Jet());
       Truck truck = new Truck();
       truck.track();

       double kmsTraveled = 100;
       double milesTraveled = kmsTraveled * FlightEnabled.MILES_TO_KM;
        System.out.printf("The truck travelled %.2f km or %.2f miles",kmsTraveled,milesTraveled);
    }

    private static void inFligt(FlightEnabled flier){
       flier.takeOff();
       flier.fly();
       if(flier instanceof Trackable tracked){
          tracked.track();
       }
       flier.land();
    }
}