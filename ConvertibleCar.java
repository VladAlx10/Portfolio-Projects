package proiectPolimorfism;

public class ConvertibleCar extends Car{
    public ConvertibleCar(String make, String model) {
        super(make, model);
    }


    @Override
    public void showDetails(){
        System.out.println("This car, " + getMake() + " " + getModel() + " is convertible");
    }
}
