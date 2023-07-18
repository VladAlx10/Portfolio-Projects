package proiectPolimorfism;

public class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void describeCar(){
        showDetails();
    }

    public void showDetails(){
        System.out.println("This car, " + this.make + " " + this.model + " has a nice body type");
    }
}
