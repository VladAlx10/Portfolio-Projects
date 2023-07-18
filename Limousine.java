package proiectPolimorfism;

public class Limousine extends Car{
    public Limousine(String make, String model) {
        super(make, model);
    }

    @Override
    public void showDetails(){
        System.out.println("This car, " + getMake() + " " + getModel() + " is a limousine");
    }
}
