public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(getExplicitType()+" "+"Swimming Lazily.");
        }else{
            System.out.println(getExplicitType()+" "+"Darting Frantically.");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish"){
            System.out.print("Swish! ");
        }else{
            System.out.print("Splash! ");
        }
    }
}
