
abstract class Mammal extends Animal{
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType());
        System.out.println(speed.equals("slow") ? "Walking" : "Running");
    }

    public abstract void shedHair();
}
public abstract class Animal {

    public String type;
    public String size;
    public double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getExplicitType(){
        return getClass().getName()+"("+type+"),";
    }

    public abstract void move(String speed);
    public abstract void makeNoise();
}
