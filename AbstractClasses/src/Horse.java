public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.print(getExplicitType()+" Shed hair in spring.");
    }

    @Override
    public void makeNoise() {
        System.out.print("Neigh! ");
    }
}
