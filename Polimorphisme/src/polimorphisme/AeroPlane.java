package polimorphisme;
public abstract class AeroPlane extends Vehicle {
    @Override
    public void walk(){
        System.out.println("Aeroplan Flying");
    }
    @Override
    public void fuel(){
        System.out.println("Not fuels");
    }
    public static void main(String[] args) {
        AeroPlane garuda = new AeroPlane() {};
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
