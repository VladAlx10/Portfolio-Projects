package proiectPolimorfism;

public class MiniVan extends Car{
    public MiniVan(String make, String model) {
        super(make, model);
    }

    @Override
    public void showDetails(){
        System.out.println("This car, " + getMake() + " " + getModel() + " is a mini-van");
    }
}
