import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Wolf","small",50);
        dog.makeNoise();
        dog.move("slow");
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Fish("Goldfish","small",1));
        animals.add(new Dog("German Shepard","Big",150));
        animals.add(new Fish("Baracudda","Big",70));
        animals.add(new Dog("Pug","small",1));
        animals.add(new Horse("Clydesdale","large",1000));

        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }
    }



    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("fast");
    }
}