package proiectPolimorfism;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Scrie o clasă Car și alte două clase derivate ConvertibleCar, Minivan și Limousine.
        //Declară două metode în clasa de bază describeCar() și showDetails() care să afișeze la consolă un text cu detalii comune.
        //Apelează metoda showDetails() în metoda describeCar()
        //Suprascrie metoda showDetails() în clasele derivate.
        //Declară o metodă statică test1() în clasa în care se află metoda main(). În aceasta, apelează metoda describeCar() de patru ori, câte o dată pentru fiecare tip de mașină. Apelează metoda test1() în main() și observă diferențele.
        //Declară o metodă statică test2() în clasa în care se află metoda main(). Aici, declară o listă în care să adaugi câte 3 mașini din fiecare tip. Apelează metoda describeCar() prin fiecare mașină, prin parcurgerea listei folosind un foreach. Apelează metoda test2() în main() și observă diferențele.
        //Declară o metodă statică test3() în clasa în care se află metoda main(). Declară câte un obiect din fiecare tip, pe care le vei stoca în variabile de tip Car. În aceasta, apelează metoda describeCar() de patru ori, câte o dată pentru fiecare tip de mașină. Apelează metoda test3() în main() și observă diferențele.

//        MiniVan miniVan = new MiniVan("Volkswagen", "Caddy");
//        Limousine limousine = new Limousine("Mercedes-Benz", "S63 AMG");
//        ConvertibleCar convertibleCar = new ConvertibleCar("BMW", "335d E93");
//
//        miniVan.describeCar();
//        limousine.describeCar();
//        convertibleCar.describeCar();

          test1();
          test2();
          test3();



    }

    public static void test1(){
        MiniVan miniVan = new MiniVan("Volkswagen", "Caddy");
        Limousine limousine = new Limousine("Mercedes-Benz", "S63 AMG");
        ConvertibleCar convertibleCar = new ConvertibleCar("BMW", "335d E93");

        miniVan.describeCar();
        limousine.describeCar();
        convertibleCar.describeCar();
    }

    public static void test2(){
        ArrayList<Car> cars = new ArrayList<>(
                Arrays.asList(new MiniVan("Volkswagen", "Caddy"),
                              new MiniVan("Opel", "Zafira"),
                              new MiniVan("Renault", "Scenic"),
                              new Limousine("Mercedes-Benz", "E43 AMG"),
                              new Limousine("Audi", "A8L"),
                              new Limousine("BMW", "750i G11"),
                              new ConvertibleCar("BMW", "440i F32"),
                              new ConvertibleCar("Audi", "S5"),
                              new ConvertibleCar("Mercedes", "C63S AMG"))
        );
        for (Car c : cars) {
           c.describeCar();
        }
    }

    public static void test3(){
        Car carConvertible = new ConvertibleCar("BMW", "335i E93");
        Car carLimousine = new Limousine("Renault", "Megane");
        Car carMiniVan = new MiniVan("Volkswagen", "Caddy");

        carConvertible.describeCar();
        carLimousine.describeCar();
        carMiniVan.describeCar();
    }

}